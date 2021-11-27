package Response.GetListOfAutoPolicies;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "policyNumber",
        "effectiveDate",
        "expirationDate",
        "premium",
        "inRenewal",
        "dividend",
        "payment",
        "drivers",
        "vehicles",
        "multiPolicyDiscounts",
        "otherDiscounts"
})

public class RootArrayOFAutoPolicyResponse {

    @JsonProperty("policyNumber")
    private String policyNumber;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("premium")
    private Integer premium;
    @JsonProperty("inRenewal")
    private Boolean inRenewal;
    @JsonProperty("dividend")
    private Double dividend;
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("drivers")
    private List<Driver> drivers = null;
    @JsonProperty("vehicles")
    private List<Vehicle> vehicles = null;
    @JsonProperty("multiPolicyDiscounts")
    private List<String> multiPolicyDiscounts = null;
    @JsonProperty("otherDiscounts")
    private List<String> otherDiscounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("policyNumber")
    public String getPolicyNumber() {
        return policyNumber;
    }

    @JsonProperty("policyNumber")
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("premium")
    public Integer getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    @JsonProperty("inRenewal")
    public Boolean getInRenewal() {
        return inRenewal;
    }

    @JsonProperty("inRenewal")
    public void setInRenewal(Boolean inRenewal) {
        this.inRenewal = inRenewal;
    }

    @JsonProperty("dividend")
    public Double getDividend() {
        return dividend;
    }

    @JsonProperty("dividend")
    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @JsonProperty("drivers")
    public List<Driver> getDrivers() {
        return drivers;
    }

    @JsonProperty("drivers")
    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @JsonProperty("vehicles")
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("multiPolicyDiscounts")
    public List<String> getMultiPolicyDiscounts() {
        return multiPolicyDiscounts;
    }

    @JsonProperty("multiPolicyDiscounts")
    public void setMultiPolicyDiscounts(List<String> multiPolicyDiscounts) {
        this.multiPolicyDiscounts = multiPolicyDiscounts;
    }

    @JsonProperty("otherDiscounts")
    public List<String> getOtherDiscounts() {
        return otherDiscounts;
    }

    @JsonProperty("otherDiscounts")
    public void setOtherDiscounts(List<String> otherDiscounts) {
        this.otherDiscounts = otherDiscounts;
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

