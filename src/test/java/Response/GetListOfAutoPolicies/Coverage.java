package Response.GetListOfAutoPolicies;




import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coverageCode",
        "coverageDescription",
        "limits",
        "premium",
        "frequency"
})

public class Coverage {

    @JsonProperty("coverageCode")
    private String coverageCode;
    @JsonProperty("coverageDescription")
    private String coverageDescription;
    @JsonProperty("limits")
    private List<Integer> limits = null;
    @JsonProperty("premium")
    private Integer premium;
    @JsonProperty("frequency")
    private String frequency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coverageCode")
    public String getCoverageCode() {
        return coverageCode;
    }

    @JsonProperty("coverageCode")
    public void setCoverageCode(String coverageCode) {
        this.coverageCode = coverageCode;
    }

    @JsonProperty("coverageDescription")
    public String getCoverageDescription() {
        return coverageDescription;
    }

    @JsonProperty("coverageDescription")
    public void setCoverageDescription(String coverageDescription) {
        this.coverageDescription = coverageDescription;
    }

    @JsonProperty("limits")
    public List<Integer> getLimits() {
        return limits;
    }

    @JsonProperty("limits")
    public void setLimits(List<Integer> limits) {
        this.limits = limits;
    }

    @JsonProperty("premium")
    public Integer getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
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


