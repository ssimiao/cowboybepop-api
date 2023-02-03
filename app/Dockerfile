FROM ibm-semeru-runtimes:open-17.0.5_8-jre
COPY /build/libs/app-1.0.0.jar app.jar
ENTRYPOINT ["java","-Xmx128m","-jar","/app.jar"]
