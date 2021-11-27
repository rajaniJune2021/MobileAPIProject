package Response.MembershipDetails;




import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paymentsInTransit"
})

public class PendingPayments {

    @JsonProperty("paymentsInTransit")
    private List<Object> paymentsInTransit = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paymentsInTransit")
    public List<Object> getPaymentsInTransit() {
        return paymentsInTransit;
    }

    @JsonProperty("paymentsInTransit")
    public void setPaymentsInTransit(List<Object> paymentsInTransit) {
        this.paymentsInTransit = paymentsInTransit;
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
