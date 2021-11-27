
package Response.MembershipDetails;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class AutoPayDetails {

    @JsonProperty("autoPayAccountType")
    private String autoPayAccountType;
    @JsonProperty("accountLastFour")
    private String accountLastFour;
    @JsonProperty("cardType")
    private String cardType;
    @JsonProperty("cardExpirationDate")
    private String cardExpirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("autoPayAccountType")
    public String getAutoPayAccountType() {
        return autoPayAccountType;
    }

    @JsonProperty("autoPayAccountType")
    public void setAutoPayAccountType(String autoPayAccountType) {
        this.autoPayAccountType = autoPayAccountType;
    }

    @JsonProperty("accountLastFour")
    public String getAccountLastFour() {
        return accountLastFour;
    }

    @JsonProperty("accountLastFour")
    public void setAccountLastFour(String accountLastFour) {
        this.accountLastFour = accountLastFour;
    }

    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("cardType")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("cardExpirationDate")
    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    @JsonProperty("cardExpirationDate")
    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
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

