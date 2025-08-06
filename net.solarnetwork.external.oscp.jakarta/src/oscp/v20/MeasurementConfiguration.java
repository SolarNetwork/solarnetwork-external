
package oscp.v20;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MeasurementConfiguration
 * <p>
 * 
 * 
 */
public enum MeasurementConfiguration {

    CONTINUOUS("CONTINUOUS"),
    INTERMITTENT("INTERMITTENT");
    private final String value;
    private final static Map<String, MeasurementConfiguration> CONSTANTS = new HashMap<String, MeasurementConfiguration>();

    static {
        for (MeasurementConfiguration c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MeasurementConfiguration(String value) {
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
    public static MeasurementConfiguration fromValue(String value) {
        MeasurementConfiguration constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
