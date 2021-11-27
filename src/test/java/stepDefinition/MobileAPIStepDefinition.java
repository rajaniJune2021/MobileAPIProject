package stepDefinition;

import Request.CreateMemberShip;
import Request.LoginMembershipRequestBody;
import Response.GetListOfAutoPolicies.RootArrayOFAutoPolicyResponse;
import Response.GetListOfPolicies.ListOfPolicies;
import Response.LoginMembership.LoginMembership;
import Response.MembershipDetails.MemberInfo;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Assert;



import java.util.HashMap;
import java.util.Map;

public class MobileAPIStepDefinition {

  public static RequestSpecification  requestSpecification;
    Map<String, String> map = new HashedMap();
    Map<String,String> map1 = new HashMap<>();
    String accessToken;
    String autoPolicyNumber;
    String customerId;
//    SoftAssert softAssert = new SoftAssert();
    public static Response response;
    String responseAutoPolicyNumber;
    String memberShipNumber;



//    @Given("Set POST request body clientId {string} and secretID {string}")
//    public void set_post_request_body_client_id_and_secret_id(String clientId, String clientSecret) {
//        requestSpecification.headers(map);
//    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
@Given("^set the base uri as \"([^\"]*)\"$")
    public void set_the_base_uri_as(String baseUri) {
        requestSpecification= RestAssured.given().baseUri(baseUri);
        RestAssured.useRelaxedHTTPSValidation();
    }

//    @Given("Set POST request Body Of Register User email as {string} password as {string} memExpDate as {string} memNumber as {string} and DOB as {string}")
//    public void set_post_request_body_of_register_user_email_as_password_as_mem_exp_date_as_mem_number_as_and_dob_as(String emailAddress, String password, String membershipExpDate, String membershipNumber, String dateOfBirth) {
//        CreateMemberShip createMemberShip = new CreateMemberShip(emailAddress, password, membershipExpDate, membershipNumber, dateOfBirth);
//        requestSpecification.given().body(createMemberShip);
//    }


    @Description("post login member")
    @Step("post login member")
    @Severity(SeverityLevel.CRITICAL)
    @And("^Set POST request body Of Login Member username as \"([^\"]*)\" password as \"([^\"]*)\" clubCode as \"([^\"]*)\"$")
    public void set_post_request_body_of_login_member_username_as_password_as_club_code_as(String userName, String password, String clubCode) {
        LoginMembershipRequestBody loginMembershipRequestBody = new LoginMembershipRequestBody(userName, password, clubCode);
        requestSpecification.given().body(loginMembershipRequestBody);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
    @And("^Submit POST Login user request \"([^\"]*)\"$")
    public void submit_post_login_user_request(String login) {
        response = requestSpecification.given().when().post(login);
        System.out.println("response code is:" + response.statusCode());
        System.out.println("response is:" + response.asString());
    }

//    @When("Submit POST Register user request {string}")
//    public void submit_post_register_user_request(String register) {
//        response = requestSpecification.given().when().post(register);
//        System.out.println("response code is:" + response.statusCode());
//        System.out.println("response is:" + response.asString());
//    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
    @And("^Validate response body accessToken as \"([^\"]*)\" customerId as \"([^\"]*)\"$")
    public void validate_response_body_access_token_as_customer_id_as(String authorizationToken, String custId) {
        LoginMembership loginMembership = response.as(LoginMembership.class);
        accessToken = loginMembership.getAccessToken();
        System.out.println("This is accessToken value" + accessToken);
        customerId = loginMembership.getCustomerId();
        System.out.println("login response custID " + customerId);
//        requestSpecification = null;
//        response = null;
//        if (authorizationToken.substring(0).equalsIgnoreCase(accessToken)) {
//            Assert.assertTrue(true);
//            loginMembership.getAccessToken();
//        } else {
//            Assert.assertTrue(false);
//            System.out.println("Access token not started with letter e ");
//        }
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
    @And("^set request accessToken header \"([^\"]*)\"$")
    public void set_request_access_token_header(String authorizationHeader) {
         requestSpecification.given().header(authorizationHeader,"Bearer "+accessToken);
    }

    @And("^Validate response body memberNumber as \"([^\"]*)\"$")
    public void validate_response_body_member_number_as(String membershipNumberFromFeatureFile) {
          LoginMembership loginMembership = response.as(LoginMembership.class);
          memberShipNumber  =   loginMembership.getMemberNumber();
//         if(membershipNumberFromFeatureFile.length() == memberShipNumber.length()){
//             Assert.assertTrue(true);
//         }else{
//             Assert.assertTrue(false);
//         }
    }

    @And("^Submit Get list of membershipDetails \"([^\"]*)\"$")
    public void submit_get_list_of_membership_details(String getMemberUrl) {
        map.put("clubCode", "004");
        map.put("customerId", customerId );
        System.out.println(map);
        System.out.println("accessToken value after resetting to null  " + accessToken);
        requestSpecification.given().queryParams(map).body("");
        response = requestSpecification.when().get(getMemberUrl+memberShipNumber).then().extract().response();
        System.out.println("get Membership details response code" + response.statusCode());
        System.out.println("get Membership details response fields "+response.asString());
    }

    @And("^validate response fields memberNumber as \"([^\"]*)\"$")
    public void validate_response_fields_member_number_as(String memberNumber) {
        MemberInfo memberInfo  = response.as(MemberInfo.class);
         memberNumber =   memberInfo.getMemberNumber();
         Assert.assertEquals(memberShipNumber.substring(5,14), memberNumber);

    }

//    @Given("Set GET List of Policies parameter clubCode as {string} customerId as {string}")
//    public void set_get_list_of_policies_parameter_club_code_as_customer_id_as(String clubCode, String custId) {
//        map.put("clubCode", clubCode);
//        map.put("customerId", customerId );
//        System.out.println(map);
//        requestSpecification.given().queryParams(map).body("");
//    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Get list of policies")
    @Step("Get list of policies")
    @And("^Submit GET list of policies \"([^\"]*)\"$")
    public void submit_get_list_of_policies(String getUrl) {
        map.put("clubCode", "004");
        map.put("customerId", customerId );
        System.out.println(map);
        System.out.println("accessToken value after resetting to null  " + accessToken);
     //  response = requestSpecification.given().header("X-IBM-Client-Id","832512b7-ca21-4ea5-a3dd-ab53a2ce7ca2").header("X-IBM-Client-Secret","jB8oN2hF3wQ0jD8cY0cD7kA8cW4dY4tH7dH8bB0eU5nO1jJ1lQ").header("authorizationHeader","Bearer "+accessToken).queryParams(map).body("").get(getUrl).then().extract().response();
       requestSpecification.given().queryParams(map).body("");
        response = requestSpecification.when().get(getUrl).then().extract().response();
        System.out.println("get policies response code " + response.statusCode());
//     userStepDefinition.response = userStepDefinition.requestSpecification.given().get(getUrl);
        System.out.println("get list of policies response" + response.asString());
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("Validate policy type")
    @And("^validate response fields policyType as \"([^\"]*)\" policyNumber as \"([^\"]*)\"$")
    public void validate_response_fields_policy_type_as_policy_number_as(String policyType, String policyNumber) {
        System.out.println("get list of policies response  "+response.asString());
        System.out.println(response.statusCode());
       ListOfPolicies listOfPolicies = response.as(ListOfPolicies.class);
       String autoPolicyType = listOfPolicies.getInsurancePolicyList().get(1).getPolicyType().substring(0);
        autoPolicyNumber = listOfPolicies.getInsurancePolicyList().get(1).getPolicyNumber().substring(0);
//          if(autoPolicyType.contains(policyType)){
//              softAssert.assertTrue(true);
//          }else {
//              softAssert.assertTrue(false);
//          }
//          if(autoPolicyNumber.contains(policyNumber)){
//              softAssert.assertTrue(true);
//          }else{
//              softAssert.assertTrue(false);
//          }
//          softAssert.assertAll();
    }

//    @Given("Set GET list of Auto policies parameter autopolicyNumber as {string}  clubCode as {string} customerId as {string}")
//    public void set_get_list_of_auto_policies_parameter_autopolicy_number_as_club_code_as_customer_id_as(String autoPolicyNumberKey, String clubCode, String customerIdKey) {
//        map.put(autoPolicyNumberKey,autoPolicyNumber);
//        map.put("clubCode", clubCode);
//        map.put(customerIdKey,customerId);
//       requestSpecification.given().queryParams(map).body("");
//
//    }
    @Severity(SeverityLevel.CRITICAL)
    @Description("Get list of auto policies")
    @Step("Get list of auto policies")
    @And("^Submit GET list of auto policies \"([^\"]*)\"$")
    public void submit_get_list_of_auto_policies(String getAutoPolicyUrl) {
      //  System.out.println("printing access token afeter get of list of policies api trigger"+ accessToken);
        response =  requestSpecification.when().get(getAutoPolicyUrl+"/CAA026395927").then().extract().response();
        // System.out.println(RestAssured.baseURI+":"+RestAssured.port+RestAssured.basePath);
        System.out.println("get autopolicies response is:"+response.asString());
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Get list of auto policies")
    @Step("Get list of auto policies")
    @And("^validate response fields autoPolicyNumber as \"([^\"]*)\"$")
    public void validate_response_fields_auto_policy_number_as(String autoPolicyNumberResponse) {
        RootArrayOFAutoPolicyResponse rootArrayOFAutoPolicyResponse = response.as(RootArrayOFAutoPolicyResponse.class);
        System.out.println(response.statusCode());
        System.out.println("get list of autopolicy numbers "+response.asString());
       responseAutoPolicyNumber = rootArrayOFAutoPolicyResponse.getPolicyNumber();
        Assert.assertEquals(autoPolicyNumberResponse,responseAutoPolicyNumber);
    }


}
