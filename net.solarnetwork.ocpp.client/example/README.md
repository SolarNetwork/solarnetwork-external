# Class generation

The OCPP classes were generated via the `wsimport` command, like this:

	wsimport -extension -p ocpp.v15 -target 2.1 -d . -Xnocompile -XadditionalHeaders \
		-B-mark-generated ocpp_centralsystemservice_1.5_final.wsdl
