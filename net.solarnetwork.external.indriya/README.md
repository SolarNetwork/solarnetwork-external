# Indriya JSR-385 javax.measure Implementation

This project contains an OSGi bundle that wraps up the various Indriya `javax.measure` 2.x JARs in
a more OSGi-friendly package that works in Java 8.

The `javax.measure` API relies on the non-OSGi friendly `java.util.ServiceLoader` class to
dynamically discover various services under an abstract `javax.measure.spi.ServiceProvider` class.
To work better in OSGi, this bundle defines the
[`net.solarnetwork.javax.measure.MeasurementServiceProvider`][MeasurementServiceProvider] API that
loosely follows the `javax.measure.spi.ServiceProvider` API. When activated, this bundle will
publish several instances of the [`MeasurementServiceProvider`][MeasurementServiceProvider] service
at runtime, each backed by a different `ServiceProvider` for different systems of units:

 * **UCUM** - Unified Code for Units of Measure
 * **Common** - Common Imperial and US units
 * **SI** - Système International d'Unités (International System) units and some common non-SI units
 * **Unicode** - Unicode Common Locale Data Repository (CLDR) units
 * **Default** - the default units defined by Indriya

## OSGi service properties

Each registered [`MeasurementServiceProvider`][MeasurementServiceProvider] service will include
the following service properties:

| Property | Description |
|:---------|:------------|
| `service.name` | The name as shown in the list of instances above, e.g. `UCUM`, `SI`, etc. |
| `service.ranking` | Set to the priority of the `ServiceProvider` that backs the service. The list of instances above is shown in descending rank, so `UCUM` will be the default service used if no other service filter criteria are used. |
| `service.vendor` | Set to `Indriya`. |

At runtime, you can thus access a specific unit system by using a service filter. For example, to
access the SI instance, you would do something like this:

```java
org.osgi.framework.BundleContext ctx = ...;
ServiceReference<MeasurementServiceProvider>[] refs = ctx.getServiceReferences(
    MeasurementServiceProvider.class, "(service.name=SI)");
```

[MeasurementServiceProvider]: src/net/solarnetwork/javax/measure/
