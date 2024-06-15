# AWS SDK 1.12 Mini OSGi

This project contains build scripts for creating a slimmed-down AWS SDK JAR with OSGi support. The
[official aws-java-sdk-osgi][official] JAR is a rather hefty 145MB+. SolarNode relies on only a
subset of the functionality included in that JAR, such as:

 * S3
 
Unfortunately the individual SDK JARs do not support OSGi, so this project creates a "fat" JAR out
of just the individual SDK JARs needed by SolarNode and then adds OSGi metadata to that.

# Building

To build the JAR, you need the [`bnd`][bnd] tool installed. First generate the "fat" JAR with

```
./gradlew shadowJar
```

Then add the OSGi metadata with

```
bnd bnd.bnd
```

This will produce a `build/libs/net.solarnetwork.external.aws-sdk-mini-X.jar`.

[bnd]: https://bnd.bndtools.org/
[official]: https://search.maven.org/search?q=a:aws-java-sdk-osgi
