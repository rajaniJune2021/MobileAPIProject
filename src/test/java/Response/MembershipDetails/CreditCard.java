package Response.MembershipDetails;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cardKey",
        "cardLastFour",
        "cardType",
        "cardHolderName",
        "expirationMonth",
        "expirationYear",
        "cvvIndicator",
        "isDebitCard",
        "zip"
})

public class CreditCard {

    @JsonProperty("cardKey")
    private String cardKey;
    @JsonProperty("cardLastFour")
    private String cardLastFour;
    @JsonProperty("cardType")
    private String cardType;
    @JsonProperty("cardHolderName")
    private String cardHolderName;
    @JsonProperty("expirationMonth")
    private String expirationMonth;
    @JsonProperty("expirationYear")
    private String expirationYear;
    @JsonProperty("cvvIndicator")
    private String cvvIndicator;
    @JsonProperty("isDebitCard")
    private Boolean isDebitCard;
    @JsonProperty("zip")
    private String zip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cardKey")
    public String getCardKey() {
        return cardKey;
    }

    @JsonProperty("cardKey")
    public void setCardKey(String cardKey) {
        this.cardKey = cardKey;
    }

    @JsonProperty("cardLastFour")
    public String getCardLastFour() {
        return cardLastFour;
    }

    @JsonProperty("cardLastFour")
    public void setCardLastFour(String cardLastFour) {
        this.cardLastFour = cardLastFour;
    }

    @JsonProperty("cardType")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("cardType")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("cardHolderName")
    public String getCardHolderName() {
        return cardHolderName;
    }

    @JsonProperty("cardHolderName")
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @JsonProperty("expirationMonth")
    public String getExpirationMonth() {
        return expirationMonth;
    }

    @JsonProperty("expirationMonth")
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    @JsonProperty("expirationYear")
    public String getExpirationYear() {
        return expirationYear;
    }

    @JsonProperty("expirationYear")
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    @JsonProperty("cvvIndicator")
    public String getCvvIndicator() {
        return cvvIndicator;
    }

    @JsonProperty("cvvIndicator")
    public void setCvvIndicator(String cvvIndicator) {
        this.cvvIndicator = cvvIndicator;
    }

    @JsonProperty("isDebitCard")
    public Boolean getIsDebitCard() {
        return isDebitCard;
    }

    @JsonProperty("isDebitCard")
    public void setIsDebitCard(Boolean isDebitCard) {
        this.isDebitCard = isDebitCard;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
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

