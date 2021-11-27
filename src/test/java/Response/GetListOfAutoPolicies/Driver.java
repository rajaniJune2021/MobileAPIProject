package Response.GetListOfAutoPolicies;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "driverId",
        "firstName",
        "lastName",
        "driverType",
        "relationship",
        "accidents",
        "convictions",
        "discounts"
})

public class Driver {

    @JsonProperty("driverId")
    private String driverId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("driverType")
    private String driverType;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("accidents")
    private Integer accidents;
    @JsonProperty("convictions")
    private Convictions convictions;
    @JsonProperty("discounts")
    private List<String> discounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("driverId")
    public String getDriverId() {
        return driverId;
    }

    @JsonProperty("driverId")
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("driverType")
    public String getDriverType() {
        return driverType;
    }

    @JsonProperty("driverType")
    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("accidents")
    public Integer getAccidents() {
        return accidents;
    }

    @JsonProperty("accidents")
    public void setAccidents(Integer accidents) {
        this.accidents = accidents;
    }

    @JsonProperty("convictions")
    public Convictions getConvictions() {
        return convictions;
    }

    @JsonProperty("convictions")
    public void setConvictions(Convictions convictions) {
        this.convictions = convictions;
    }

    @JsonProperty("discounts")
    public List<String> getDiscounts() {
        return discounts;
    }

    @JsonProperty("discounts")
    public void setDiscounts(List<String> discounts) {
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

