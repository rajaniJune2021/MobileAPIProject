package Response.GetListOfAutoPolicies;



import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "major",
        "minor",
        "severe",
        "serious"
})

public class Convictions {

    @JsonProperty("major")
    private Integer major;
    @JsonProperty("minor")
    private Integer minor;
    @JsonProperty("severe")
    private Integer severe;
    @JsonProperty("serious")
    private Integer serious;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("major")
    public Integer getMajor() {
        return major;
    }

    @JsonProperty("major")
    public void setMajor(Integer major) {
        this.major = major;
    }

    @JsonProperty("minor")
    public Integer getMinor() {
        return minor;
    }

    @JsonProperty("minor")
    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    @JsonProperty("severe")
    public Integer getSevere() {
        return severe;
    }

    @JsonProperty("severe")
    public void setSevere(Integer severe) {
        this.severe = severe;
    }

    @JsonProperty("serious")
    public Integer getSerious() {
        return serious;
    }

    @JsonProperty("serious")
    public void setSerious(Integer serious) {
        this.serious = serious;
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

