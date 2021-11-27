package Response.GetListOfAutoPolicies;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "balanceAmount",
        "minimumDue",
        "dueDate"
})

public class PaymentDueInfo {

    @JsonProperty("balanceAmount")
    private Double balanceAmount;
    @JsonProperty("minimumDue")
    private Double minimumDue;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("balanceAmount")
    public Double getBalanceAmount() {
        return balanceAmount;
    }

    @JsonProperty("balanceAmount")
    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @JsonProperty("minimumDue")
    public Double getMinimumDue() {
        return minimumDue;
    }

    @JsonProperty("minimumDue")
    public void setMinimumDue(Double minimumDue) {
        this.minimumDue = minimumDue;
    }

    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
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
