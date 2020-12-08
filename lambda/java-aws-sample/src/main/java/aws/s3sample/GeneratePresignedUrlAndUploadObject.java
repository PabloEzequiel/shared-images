package aws.s3sample;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.HttpMethod;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.S3Object;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Saple code from:
 * https://docs.aws.amazon.com/AmazonS3/latest/dev/PresignedUrlUploadObjectJavaSDK.html
 */
public class GeneratePresignedUrlAndUploadObject {

    public static void main(String[] args) throws IOException {
        Regions clientRegion = Regions.US_EAST_1; // Regions.DEFAULT_REGION;
        String bucketName = "ninja-presigned-bucket-web";
        String objectKey  = "ninja-object.txt";

        try {
         
            // Pablo
            ProfileCredentialsProvider profile = new ProfileCredentialsProvider();

            AWSCredentials credentials = profile.getCredentials();

            System.out.println("Profile: " + profile.toString());
            System.out.println("credentials: " + credentials.toString());

            // System.out.println("credentials [AWS Access Key   ]: " + credentials.getAWSAccessKeyId());
	        // System.out.println("credentials [AWS Access Secret]: " + credentials.getAWSSecretKey());
	

            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withCredentials(profile)
                    .withRegion(clientRegion)
                    .build();

            // Set the pre-signed URL to expire after one hour.
            java.util.Date expiration = new java.util.Date();
            long expTimeMillis = expiration.getTime();
            expTimeMillis += 1000 * 60 * 60;
            expiration.setTime(expTimeMillis);


            System.out.println("Generating pre-signed URL.");

            GeneratePresignedUrlRequest generatePresignedUrlRequest = new GeneratePresignedUrlRequest(bucketName, objectKey)
                    .withMethod(HttpMethod.PUT)
                    .withExpiration(expiration);
            URL urlPOST = s3Client.generatePresignedUrl(generatePresignedUrlRequest);

            System.out.println("PresignedUrlRequest [POST]: " + urlPOST); 

            // Upload the new object using the pre-signed URL.
            HttpURLConnection connection = (HttpURLConnection) urlPOST.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("PUT");
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
            out.write("Un objeto Ninja, creado via presigned URL.");
            out.close();


            // Generating pre-signed URL [xGET].
            System.out.println("Generating pre-signed URL [xGET].");
            GeneratePresignedUrlRequest generatePresignedUrlRequestGET = new GeneratePresignedUrlRequest(bucketName, objectKey)
                    .withMethod(HttpMethod.GET)
                    .withExpiration(expiration);
            URL urlGET = s3Client.generatePresignedUrl(generatePresignedUrlRequestGET);

            System.out.println("PresignedUrlRequest [GET]: " + urlGET); 


            // Check the HTTP response code
            connection.getResponseCode();
            System.out.println("HTTP response code: " + connection.getResponseCode());

            // Check the object was uploaded successfully.
            S3Object object = s3Client.getObject(bucketName, objectKey);
            System.out.println("Object " + object.getKey() + " created in bucket " + object.getBucketName());

        } catch (AmazonServiceException e) {
            e.printStackTrace();
        } catch (SdkClientException e) {
            e.printStackTrace();
        }



    }
}

