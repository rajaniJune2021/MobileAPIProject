package stepDefinition;//package stepDefinition;
//
import cucumber.api.java.en.And;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import stepDefinition.MobileAPIStepDefinition;

public class requestHandler {

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
    @And("^set request header \"([^\"]*)\" as \"([^\"]*)\"$")
    public void set_request_header_as(String header, String headerValue) {
      MobileAPIStepDefinition.requestSpecification.given().header(header,headerValue);
    }
}
