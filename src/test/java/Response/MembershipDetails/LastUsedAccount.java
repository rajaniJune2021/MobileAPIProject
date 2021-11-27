package Response.MembershipDetails;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "creditCard"
})

public class LastUsedAccount {

    @JsonProperty("creditCard")
    private CreditCard creditCard;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("creditCard")
    public CreditCard getCreditCard() {
        return creditCard;
    }

    @JsonProperty("creditCard")
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
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

