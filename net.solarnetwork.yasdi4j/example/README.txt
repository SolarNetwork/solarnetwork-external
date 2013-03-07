yasdi4j README
==============================================
This bundle includes the yasdi4j static libraries as well as the YASDI
libraries, however the YASDI driver libraries will not load from the
bundle (libyasdi calls dlopen) and must be installed in a location 
where the SolarNode process can find them. To do this, you can place
the shared libraries in ~solar/lib and modify the startup script to
include

	-Djava.library.path=${SOLARNODE_HOME}/lib
	
in the JVM_ARGS section. Then modify ~solar/.profile to include

	export LD_LIBRARY_PATH=/home/solar/lib
	
This is not ideal... if anyone knows how to compile the driver 
libraries directly into YASDI, please chime in!
 