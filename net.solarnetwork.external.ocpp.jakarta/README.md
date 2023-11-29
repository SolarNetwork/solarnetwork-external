# Class generation

The 1.5 OCPP classes were generated via the Java 8 `wsimport` command, like this:

	wsimport -extension -p ocpp.v15.cp -target 2.2 -d . -Xnocompile -XadditionalHeaders \
		ocpp_chargepointservice_1.5_final.wsdl

	wsimport -extension -p ocpp.v15.cs -target 2.2 -d . -Xnocompile -XadditionalHeaders \
		ocpp_centralsystemservice_1.5_final.wsdl

The 1.6 OCPP classes were generated via the Maven build in the `defs/1.6` directory, like this:

	mvn clean generate-sources

The 2.0 OCPP classes are generated via the Gradle build in `defs/2.0` directory, like this:

	./gradlew generateJsonSchema2DataClass
