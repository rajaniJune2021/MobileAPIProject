package stepDefinition;

import cucumber.api.java.en.And;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.Assert;


public class responseHandler {

    @Severity(SeverityLevel.CRITICAL)
    @Description("post login member")
    @Step("post login member")
    @And("^validate response code as \"([^\"]*)\"$")
    public void validate_response_code_as(String responseStatusCode) {
        Assert.assertEquals(Integer.parseInt(responseStatusCode),MobileAPIStepDefinition.response.statusCode());
    }
}
