
package oscp.v20;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AssetCategory
 * <p>
 * 
 * 
 */
public enum AssetCategory {

    CHARGING("CHARGING"),
    CONSUMPTION("CONSUMPTION"),
    GENERATION("GENERATION"),
    STORAGE("STORAGE");
    private final String value;
    private final static Map<String, AssetCategory> CONSTANTS = new HashMap<String, AssetCategory>();

    static {
        for (AssetCategory c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AssetCategory(String value) {
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
    public static AssetCategory fromValue(String value) {
        AssetCategory constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
