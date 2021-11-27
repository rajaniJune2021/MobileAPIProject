package Response.MembershipDetails;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "firstName",
        "lastName",
        "memberLevel",
        "inceptionYear",
        "memberNumber",
        "membershipExpirationDate",
        "fullMembershipNumber",
        "memberstatus",
        "isInRenewal",
        "isOnAutoPay",
        "membershipPayment",
        "membershipPlans",
        "householdMembers",
        "options"
})

public class MemberInfo {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("memberLevel")
    private String memberLevel;
    @JsonProperty("inceptionYear")
    private String inceptionYear;
    @JsonProperty("memberNumber")
    private String memberNumber;
    @JsonProperty("membershipExpirationDate")
    private String membershipExpirationDate;
    @JsonProperty("fullMembershipNumber")
    private String fullMembershipNumber;
    @JsonProperty("memberstatus")
    private String memberstatus;
    @JsonProperty("isInRenewal")
    private Boolean isInRenewal;
    @JsonProperty("isOnAutoPay")
    private Boolean isOnAutoPay;
    @JsonProperty("membershipPayment")
    private MembershipPayment membershipPayment;
    @JsonProperty("membershipPlans")
    private List<MembershipPlan> membershipPlans = null;
    @JsonProperty("householdMembers")
    private List<HouseholdMember> householdMembers = null;
    @JsonProperty("options")
    private List<Object> options = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("memberLevel")
    public String getMemberLevel() {
        return memberLevel;
    }

    @JsonProperty("memberLevel")
    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    @JsonProperty("inceptionYear")
    public String getInceptionYear() {
        return inceptionYear;
    }

    @JsonProperty("inceptionYear")
    public void setInceptionYear(String inceptionYear) {
        this.inceptionYear = inceptionYear;
    }

    @JsonProperty("memberNumber")
    public String getMemberNumber() {
        return memberNumber;
    }

    @JsonProperty("memberNumber")
    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    @JsonProperty("membershipExpirationDate")
    public String getMembershipExpirationDate() {
        return membershipExpirationDate;
    }

    @JsonProperty("membershipExpirationDate")
    public void setMembershipExpirationDate(String membershipExpirationDate) {
        this.membershipExpirationDate = membershipExpirationDate;
    }

    @JsonProperty("fullMembershipNumber")
    public String getFullMembershipNumber() {
        return fullMembershipNumber;
    }

    @JsonProperty("fullMembershipNumber")
    public void setFullMembershipNumber(String fullMembershipNumber) {
        this.fullMembershipNumber = fullMembershipNumber;
    }

    @JsonProperty("memberstatus")
    public String getMemberstatus() {
        return memberstatus;
    }

    @JsonProperty("memberstatus")
    public void setMemberstatus(String memberstatus) {
        this.memberstatus = memberstatus;
    }

    @JsonProperty("isInRenewal")
    public Boolean getIsInRenewal() {
        return isInRenewal;
    }

    @JsonProperty("isInRenewal")
    public void setIsInRenewal(Boolean isInRenewal) {
        this.isInRenewal = isInRenewal;
    }

    @JsonProperty("isOnAutoPay")
    public Boolean getIsOnAutoPay() {
        return isOnAutoPay;
    }

    @JsonProperty("isOnAutoPay")
    public void setIsOnAutoPay(Boolean isOnAutoPay) {
        this.isOnAutoPay = isOnAutoPay;
    }

    @JsonProperty("membershipPayment")
    public MembershipPayment getMembershipPayment() {
        return membershipPayment;
    }

    @JsonProperty("membershipPayment")
    public void setMembershipPayment(MembershipPayment membershipPayment) {
        this.membershipPayment = membershipPayment;
    }

    @JsonProperty("membershipPlans")
    public List<MembershipPlan> getMembershipPlans() {
        return membershipPlans;
    }

    @JsonProperty("membershipPlans")
    public void setMembershipPlans(List<MembershipPlan> membershipPlans) {
        this.membershipPlans = membershipPlans;
    }

    @JsonProperty("householdMembers")
    public List<HouseholdMember> getHouseholdMembers() {
        return householdMembers;
    }

    @JsonProperty("householdMembers")
    public void setHouseholdMembers(List<HouseholdMember> householdMembers) {
        this.householdMembers = householdMembers;
    }

    @JsonProperty("options")
    public List<Object> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Object> options) {
        this.options = options;
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

