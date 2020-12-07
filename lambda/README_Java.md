1) Quiero ejecutar el ejemplo de "Signed URL"

a) Bajo el JAVA SDK de AWS y lo compilo

    git clone https://github.com/aws/aws-sdk-java-v2.git

b) Como es muy grande, solo compilo el módulo s3

c) También está disponible vía download, de:
    http://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip


a) Create a Java 8 Maven Proyect

    mvn archetype:generate \
        -DgroupId=aws.s3sample \
        -DartifactId=java-aws-sample \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DinteractiveMode=false

    mvn build
    mvn package
    
java -cp target/java-aws-sample-1.0-SNAPSHOT.jar aws.s3sample.GeneratePresignedUrlAndUploadObject

c) Para ejecutar el comando:

   mvn exec:java -Dexec.mainClass="aws.s3sample.GeneratePresignedUrlAndUploadObject"

Sigo a:
https://mkyong.com/maven/how-to-create-a-java-project-with-maven/

Para armar el proyecto Java y los JARS


d) Charles Certificado:

On Linux, $JAVA_HOME will probably be set already. 
On macOS, if it isn't set, try running /usr/libexec/java_home to get the location of your JVM.



1) Sobre AWS SDK for Java

    Un buen Tutorial:
    https://docs.aws.amazon.com/es_es/sdk-for-java/latest/developer-guide/get-started.html
