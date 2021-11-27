package Response.GetListOfPolicies;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "insurancePolicyList"
})

public class ListOfPolicies {

    @JsonProperty("insurancePolicyList")
    private List<InsurancePolicy> insurancePolicyList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("insurancePolicyList")
    public List<InsurancePolicy> getInsurancePolicyList() {
        return insurancePolicyList;
    }

    @JsonProperty("insurancePolicyList")
    public void setInsurancePolicyList(List<InsurancePolicy> insurancePolicyList) {
        this.insurancePolicyList = insurancePolicyList;
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
