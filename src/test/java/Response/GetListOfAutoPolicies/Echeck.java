package Response.GetListOfAutoPolicies;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "accountKey",
        "accountLastFour",
        "bankName",
        "routingNumber",
        "accountHolderName"
})

public class Echeck {

    @JsonProperty("accountKey")
    private String accountKey;
    @JsonProperty("accountLastFour")
    private String accountLastFour;
    @JsonProperty("bankName")
    private String bankName;
    @JsonProperty("routingNumber")
    private String routingNumber;
    @JsonProperty("accountHolderName")
    private String accountHolderName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountKey")
    public String getAccountKey() {
        return accountKey;
    }

    @JsonProperty("accountKey")
    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    @JsonProperty("accountLastFour")
    public String getAccountLastFour() {
        return accountLastFour;
    }

    @JsonProperty("accountLastFour")
    public void setAccountLastFour(String accountLastFour) {
        this.accountLastFour = accountLastFour;
    }

    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("bankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @JsonProperty("routingNumber")
    public String getRoutingNumber() {
        return routingNumber;
    }

    @JsonProperty("routingNumber")
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    @JsonProperty("accountHolderName")
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @JsonProperty("accountHolderName")
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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
