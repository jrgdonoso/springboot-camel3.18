FROM registry.redhat.io/fuse7/fuse-java-openshift-jdk11-rhel8:latest

WORKDIR /deployment

COPY . /deployment


USER root

RUN sed -i 's/\r$//' ./mvnw && \
    sh ./mvnw clean package -Dskiptests



EXPOSE 8080
EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "./target/KCC-Migracion-Integraciones-Fuse-CRM-Cliente-0.0.1-SNAPSHOT.jar" ]