# Class generation

The 2.0 OCPP classes are generated via the Gradle build in `defs/2.0.1` directory, like this:

```sh
./gradlew generateJsonSchema2DataClass
```

You may need to run in a specific JVM, such as

```sh
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_311.jdk/Contents/Home
```

The generated classes will be located in the `build/generated/sources/js2d/main` directory.
