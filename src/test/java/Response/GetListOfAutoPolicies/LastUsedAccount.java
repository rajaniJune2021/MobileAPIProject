package Response.GetListOfAutoPolicies;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "echeck"
})

public class LastUsedAccount {

    @JsonProperty("echeck")
    private Echeck echeck;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("echeck")
    public Echeck getEcheck() {
        return echeck;
    }

    @JsonProperty("echeck")
    public void setEcheck(Echeck echeck) {
        this.echeck = echeck;
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

