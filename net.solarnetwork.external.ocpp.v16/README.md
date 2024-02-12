# Class generation

The 1.6 OCPP classes were generated via the Java 8 `wsimport` command, like this:

	wsimport -extension -p ocpp.v16.cp -target 2.2 -d . -Xnocompile -XadditionalHeaders \
		OCPP_ChargePointService_1.6.wsdl

	wsimport -extension -p ocpp.v15.cs -target 2.2 -d . -Xnocompile -XadditionalHeaders \
		OCPP_CentralSystemService_1.6.wsdl

