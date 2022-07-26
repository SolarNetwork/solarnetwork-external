# OSCP Support

The classes have been generated from the OSCP Json Schema files. Generate the files by changing into
the `defs/2.0` directory and running:

```sh
./gradlew generateJsonSchema2DataClass
rm -f ../../src/oscp/v20/* && mv build/generated/sources/js2d/main/oscp/v20/* ../../src/oscp/v20
```

