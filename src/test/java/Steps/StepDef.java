package Steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.AppiumDriverFactory.driver;

public class StepDef extends Base {

    @Given("landing page")
    public void landing_page() {
        landingPage.
                verifyAppLaunched();
    }

    @And("I click Wi-Fi")
    public void i_click_wi_fi() {
        landingPage.
                clickWifiButton();
    }

    @And("I enter the host")
    public void i_enter_the_host() {

    }

    @And("I enter the Port")
    public void i_enter_the_port() {

    }

    @When("I click connect")
    public void i_click_connect() {

    }

    @Then("the error message is displayed")
    public void the_error_message_is_displayed() {

    }

    @And("I click Ok button")
    public void i_click_ok_button() {

    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }
}
