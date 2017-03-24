
package net.solarnetwork.external.ocpp.client.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AuthorizeTest.class, HeartbeatTest.class, HMACHandlerTest.class })
public class AllTests {

}
