# Class generation

The 1.6 OCPP classes were generated via the Maven build in the `defs/1.6` directory, like this:

	mvn clean generate-sources

That will produce Java sources in the `defs/1.6/src/main/java` directory, which can be moved into
the `src` directory.