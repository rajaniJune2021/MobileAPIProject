package Response.GetListOfAutoPolicies;


import Response.MembershipDetails.PaymentDueInfo;
import Response.MembershipDetails.PendingPayments;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "allowCreditCard",
        "allowDebitCard",
        "allowEcheck",
        "allowScheduledPayment",
        "allowAutoPaySetup",
        "allowCancelScheduledPayment",
        "allowMakePayment",
        "paymentDueInfo",
        "lastUsedAccount",
        "pendingPayments"
})

public class Payment {

    @JsonProperty("allowCreditCard")
    private Boolean allowCreditCard;
    @JsonProperty("allowDebitCard")
    private Boolean allowDebitCard;
    @JsonProperty("allowEcheck")
    private Boolean allowEcheck;
    @JsonProperty("allowScheduledPayment")
    private Boolean allowScheduledPayment;
    @JsonProperty("allowAutoPaySetup")
    private Boolean allowAutoPaySetup;
    @JsonProperty("allowCancelScheduledPayment")
    private Boolean allowCancelScheduledPayment;
    @JsonProperty("allowMakePayment")
    private Boolean allowMakePayment;
    @JsonProperty("paymentDueInfo")
    private PaymentDueInfo paymentDueInfo;
    @JsonProperty("lastUsedAccount")
    private LastUsedAccount lastUsedAccount;
    @JsonProperty("pendingPayments")
    private PendingPayments pendingPayments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("allowCreditCard")
    public Boolean getAllowCreditCard() {
        return allowCreditCard;
    }

    @JsonProperty("allowCreditCard")
    public void setAllowCreditCard(Boolean allowCreditCard) {
        this.allowCreditCard = allowCreditCard;
    }

    @JsonProperty("allowDebitCard")
    public Boolean getAllowDebitCard() {
        return allowDebitCard;
    }

    @JsonProperty("allowDebitCard")
    public void setAllowDebitCard(Boolean allowDebitCard) {
        this.allowDebitCard = allowDebitCard;
    }

    @JsonProperty("allowEcheck")
    public Boolean getAllowEcheck() {
        return allowEcheck;
    }

    @JsonProperty("allowEcheck")
    public void setAllowEcheck(Boolean allowEcheck) {
        this.allowEcheck = allowEcheck;
    }

    @JsonProperty("allowScheduledPayment")
    public Boolean getAllowScheduledPayment() {
        return allowScheduledPayment;
    }

    @JsonProperty("allowScheduledPayment")
    public void setAllowScheduledPayment(Boolean allowScheduledPayment) {
        this.allowScheduledPayment = allowScheduledPayment;
    }

    @JsonProperty("allowAutoPaySetup")
    public Boolean getAllowAutoPaySetup() {
        return allowAutoPaySetup;
    }

    @JsonProperty("allowAutoPaySetup")
    public void setAllowAutoPaySetup(Boolean allowAutoPaySetup) {
        this.allowAutoPaySetup = allowAutoPaySetup;
    }

    @JsonProperty("allowCancelScheduledPayment")
    public Boolean getAllowCancelScheduledPayment() {
        return allowCancelScheduledPayment;
    }

    @JsonProperty("allowCancelScheduledPayment")
    public void setAllowCancelScheduledPayment(Boolean allowCancelScheduledPayment) {
        this.allowCancelScheduledPayment = allowCancelScheduledPayment;
    }

    @JsonProperty("allowMakePayment")
    public Boolean getAllowMakePayment() {
        return allowMakePayment;
    }

    @JsonProperty("allowMakePayment")
    public void setAllowMakePayment(Boolean allowMakePayment) {
        this.allowMakePayment = allowMakePayment;
    }

    @JsonProperty("paymentDueInfo")
    public PaymentDueInfo getPaymentDueInfo() {
        return paymentDueInfo;
    }

    @JsonProperty("paymentDueInfo")
    public void setPaymentDueInfo(PaymentDueInfo paymentDueInfo) {
        this.paymentDueInfo = paymentDueInfo;
    }

    @JsonProperty("lastUsedAccount")
    public LastUsedAccount getLastUsedAccount() {
        return lastUsedAccount;
    }

    @JsonProperty("lastUsedAccount")
    public void setLastUsedAccount(LastUsedAccount lastUsedAccount) {
        this.lastUsedAccount = lastUsedAccount;
    }

    @JsonProperty("pendingPayments")
    public PendingPayments getPendingPayments() {
        return pendingPayments;
    }

    @JsonProperty("pendingPayments")
    public void setPendingPayments(PendingPayments pendingPayments) {
        this.pendingPayments = pendingPayments;
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
