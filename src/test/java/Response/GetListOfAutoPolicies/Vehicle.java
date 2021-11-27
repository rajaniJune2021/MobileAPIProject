package Response.GetListOfAutoPolicies;
import com.fasterxml.jackson.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vehicleId",
        "year",
        "make",
        "model",
        "vin",
        "annualMiles",
        "mileageBand",
        "garageZip",
        "premium",
        "coverages",
        "discounts"
})

public class Vehicle {

    @JsonProperty("vehicleId")
    private String vehicleId;
    @JsonProperty("year")
    private String year;
    @JsonProperty("make")
    private String make;
    @JsonProperty("model")
    private String model;
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("annualMiles")
    private Integer annualMiles;
    @JsonProperty("mileageBand")
    private String mileageBand;
    @JsonProperty("garageZip")
    private String garageZip;
    @JsonProperty("premium")
    private Double premium;
    @JsonProperty("coverages")
    private List<Coverage> coverages = null;
    @JsonProperty("discounts")
    private List<Object> discounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vehicleId")
    public String getVehicleId() {
        return vehicleId;
    }

    @JsonProperty("vehicleId")
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("make")
    public String getMake() {
        return make;
    }

    @JsonProperty("make")
    public void setMake(String make) {
        this.make = make;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("annualMiles")
    public Integer getAnnualMiles() {
        return annualMiles;
    }

    @JsonProperty("annualMiles")
    public void setAnnualMiles(Integer annualMiles) {
        this.annualMiles = annualMiles;
    }

    @JsonProperty("mileageBand")
    public String getMileageBand() {
        return mileageBand;
    }

    @JsonProperty("mileageBand")
    public void setMileageBand(String mileageBand) {
        this.mileageBand = mileageBand;
    }

    @JsonProperty("garageZip")
    public String getGarageZip() {
        return garageZip;
    }

    @JsonProperty("garageZip")
    public void setGarageZip(String garageZip) {
        this.garageZip = garageZip;
    }

    @JsonProperty("premium")
    public Double getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Double premium) {
        this.premium = premium;
    }

    @JsonProperty("coverages")
    public List<Coverage> getCoverages() {
        return coverages;
    }

    @JsonProperty("coverages")
    public void setCoverages(List<Coverage> coverages) {
        this.coverages = coverages;
    }

    @JsonProperty("discounts")
    public List<Object> getDiscounts() {
        return discounts;
    }

    @JsonProperty("discounts")
    public void setDiscounts(List<Object> discounts) {
        this.discounts = discounts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

