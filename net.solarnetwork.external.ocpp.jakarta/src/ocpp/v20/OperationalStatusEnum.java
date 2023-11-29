
package ocpp.v20;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This contains the type of availability change that the Charging Station should perform.
 * 
 * 
 * 
 */
public enum OperationalStatusEnum {

    INOPERATIVE("Inoperative"),
    OPERATIVE("Operative");
    private final String value;
    private final static Map<String, OperationalStatusEnum> CONSTANTS = new HashMap<String, OperationalStatusEnum>();

    static {
        for (OperationalStatusEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OperationalStatusEnum(String value) {
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
    public static OperationalStatusEnum fromValue(String value) {
        OperationalStatusEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
