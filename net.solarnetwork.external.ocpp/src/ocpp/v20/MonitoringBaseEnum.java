
package ocpp.v20;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Specify which monitoring base will be set
 * 
 * 
 */
public enum MonitoringBaseEnum {

    ALL("All"),
    FACTORY_DEFAULT("FactoryDefault"),
    HARD_WIRED_ONLY("HardWiredOnly");
    private final String value;
    private final static Map<String, MonitoringBaseEnum> CONSTANTS = new HashMap<String, MonitoringBaseEnum>();

    static {
        for (MonitoringBaseEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MonitoringBaseEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MonitoringBaseEnum fromValue(String value) {
        MonitoringBaseEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
