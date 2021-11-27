package stepDefinition;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\festures",glue = {"stepDefinition"},plugin= {"pretty", "json:target/cucumber-report/cucumber.json" }

)

public class TestRunner {

}
