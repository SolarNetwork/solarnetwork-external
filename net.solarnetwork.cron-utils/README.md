# SolarNetwork Cron Utils

Fork of [jmrozanec/cron-utils](https://github.com/jmrozanec/cron-utils) that
removes dependencies on `javax.ejb` (EJB API) and `org.apache.commons.cli`
(Commons CLI) packages, to simplify deployment in the SolarNetwork OSGi
environment.

Because of these removals, there is no command line support nor
`javax.ejb.ScheduleExpression` support.
