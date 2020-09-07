# SolarNetwork Jamod Modbus (PJC)

This plugin is a fork of the [Jamod Modbus][jamod] framework. The fork provides an OSGi bundle for
Jamod as well as several bug fixes and enhancements. Additionally the RXTX dependency has been
replaced by [PureJavaComm][pjc]. Jamod itself is no longer actively developed, so this fork
maintains backwards compatibility with its last published version's public API (**1.2.0.rc1**).

This plugin is an alternative to the 
[net.solarnetwork.external.net.wimpi.modbus](../net.solarnetwork.net.wimpi.modbus), which uses the
original RXTX dependency. Both plugins export the same packages, so only one should be deployed in
any given runtime.

# Modbus enhancements

## `net.wimpi.modbus.net.TCPMasterConnection`

Several configurable properties have been added to this class to help with tuning:

| Setting            | Description                                                                       |
|--------------------|-----------------------------------------------------------------------------------|
| socketReuseAddress | Toggle the `SO_REUSEADDR` socket flag; default `true`.                            |
| socketLinger       | Configure the `SO_LINGER` socket flag and length; default `1`.                    |
| socketKeepAlive    | Toggle the `SO_KEEPALIVE` socket flag; default `true`.                            |

## `net.wimpi.modbus.net.TCPMasterConnection`

Several configurable properties have been added to this class to help with tuning:

| Setting            | Description                                                                       |
|--------------------|-----------------------------------------------------------------------------------|
| retryDelayMillis   | A delay in milliseconds to wait before retrying failed transactions; default `0`. |
| retryReconnect     | When `true` close and reopen connections before retrying failed transactions.     |


 [jamod]: http://jamod.sourceforge.net/
 [pjc]: https://github.com/nyholku/purejavacomm
