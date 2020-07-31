1) Quiero ejecutar el ejemplo de "Signed URL"

a) Bajo el JAVA SDK de AWS y lo compilo

    git clone https://github.com/aws/aws-sdk-java-v2.git

b) Como es muy grande, solo compilo el módulo s3

/Users/pabloinchausti/.m2/repository/software/amazon/awssdk/s3/2.13.66-SNAPSHOT/s3-2.13.66-SNAPSHOT.jar


a) Create a Java 8 Maven Proyect

    mvn archetype:generate \
        -DgroupId=aws.s3sample \
        -DartifactId=java-aws-sample \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DinteractiveMode=false

    mvn build
    mvn package
    
java -cp target/java-aws-sample-1.0-SNAPSHOT.jar aws.s3sample.GeneratePresignedUrlAndUploadObject


Sigo a:
https://mkyong.com/maven/how-to-create-a-java-project-with-maven/

Para armar el proyecto Java y los JARS