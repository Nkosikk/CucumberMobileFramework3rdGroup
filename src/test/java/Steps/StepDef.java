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
        wifiConnectionPage.enterHostText("255.255.10.258");
    }

    @And("I enter the Port")
    public void i_enter_the_port() {
        wifiConnectionPage.enterPortText("main host");
    }

    @When("I click connect")
    public void i_click_connect() {
        wifiConnectionPage.clickConnectButton();
    }

    @Then("the error message is displayed")
    public void the_error_message_is_displayed() {
        wifiConnectionPage.verifyErrorMessageText();
    }

    @And("I click Ok button")
    public void i_click_ok_button() {
        wifiConnectionPage.clickOkButton();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }
}
