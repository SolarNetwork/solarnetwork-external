
package oscp.v20;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * AssetMeasurement
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "asset_id",
    "asset_category",
    "energy_measurement",
    "instantaneous_measurement"
})
public class AssetMeasurement implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_id")
    @NotNull
    private String assetId;
    /**
     * AssetCategory
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_category")
    @NotNull
    private AssetCategory assetCategory;
    /**
     * EnergyMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_measurement")
    @Valid
    private EnergyMeasurement energyMeasurement;
    /**
     * InstantaneousMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("instantaneous_measurement")
    @Valid
    private InstantaneousMeasurement instantaneousMeasurement;
    private final static long serialVersionUID = 588971004595674986L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssetMeasurement() {
    }

    /**
     * 
     * @param assetId
     * @param assetCategory
     */
    public AssetMeasurement(String assetId, AssetCategory assetCategory) {
        super();
        this.assetId = assetId;
        this.assetCategory = assetCategory;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_id")
    public String getAssetId() {
        return assetId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_id")
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public AssetMeasurement withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * AssetCategory
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_category")
    public AssetCategory getAssetCategory() {
        return assetCategory;
    }

    /**
     * AssetCategory
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset_category")
    public void setAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
    }

    public AssetMeasurement withAssetCategory(AssetCategory assetCategory) {
        this.assetCategory = assetCategory;
        return this;
    }

    /**
     * EnergyMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_measurement")
    public EnergyMeasurement getEnergyMeasurement() {
        return energyMeasurement;
    }

    /**
     * EnergyMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("energy_measurement")
    public void setEnergyMeasurement(EnergyMeasurement energyMeasurement) {
        this.energyMeasurement = energyMeasurement;
    }

    public AssetMeasurement withEnergyMeasurement(EnergyMeasurement energyMeasurement) {
        this.energyMeasurement = energyMeasurement;
        return this;
    }

    /**
     * InstantaneousMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("instantaneous_measurement")
    public InstantaneousMeasurement getInstantaneousMeasurement() {
        return instantaneousMeasurement;
    }

    /**
     * InstantaneousMeasurement
     * <p>
     * 
     * 
     */
    @JsonProperty("instantaneous_measurement")
    public void setInstantaneousMeasurement(InstantaneousMeasurement instantaneousMeasurement) {
        this.instantaneousMeasurement = instantaneousMeasurement;
    }

    public AssetMeasurement withInstantaneousMeasurement(InstantaneousMeasurement instantaneousMeasurement) {
        this.instantaneousMeasurement = instantaneousMeasurement;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssetMeasurement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assetId");
        sb.append('=');
        sb.append(((this.assetId == null)?"<null>":this.assetId));
        sb.append(',');
        sb.append("assetCategory");
        sb.append('=');
        sb.append(((this.assetCategory == null)?"<null>":this.assetCategory));
        sb.append(',');
        sb.append("energyMeasurement");
        sb.append('=');
        sb.append(((this.energyMeasurement == null)?"<null>":this.energyMeasurement));
        sb.append(',');
        sb.append("instantaneousMeasurement");
        sb.append('=');
        sb.append(((this.instantaneousMeasurement == null)?"<null>":this.instantaneousMeasurement));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.energyMeasurement == null)? 0 :this.energyMeasurement.hashCode()));
        result = ((result* 31)+((this.assetId == null)? 0 :this.assetId.hashCode()));
        result = ((result* 31)+((this.assetCategory == null)? 0 :this.assetCategory.hashCode()));
        result = ((result* 31)+((this.instantaneousMeasurement == null)? 0 :this.instantaneousMeasurement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetMeasurement) == false) {
            return false;
        }
        AssetMeasurement rhs = ((AssetMeasurement) other);
        return (((((this.energyMeasurement == rhs.energyMeasurement)||((this.energyMeasurement!= null)&&this.energyMeasurement.equals(rhs.energyMeasurement)))&&((this.assetId == rhs.assetId)||((this.assetId!= null)&&this.assetId.equals(rhs.assetId))))&&((this.assetCategory == rhs.assetCategory)||((this.assetCategory!= null)&&this.assetCategory.equals(rhs.assetCategory))))&&((this.instantaneousMeasurement == rhs.instantaneousMeasurement)||((this.instantaneousMeasurement!= null)&&this.instantaneousMeasurement.equals(rhs.instantaneousMeasurement))));
    }

}
