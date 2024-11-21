package Steps;

import Pages.MusingLibraryPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.AppiumDriverFactory.driver;

public class StepDef extends Base {

    @Given("landing page")
    public void landing_page() {
        musingLibraryPage.
                verifyAppLaunched();
    }

    @And("I click Wake Up")
    public void i_click_wake_up() {
      musingLibraryPage.clickWakeUpButton();
    }
    @When("I click Geisha")
    public void i_click_geisha() {
  musingLibraryPage.clickGeishaButton();
    }

    @When("I click the Allow button")
    public void i_click_the_allow_button() {
     musingLibraryPage.clickAllowButton();
    }
    @Then("music must play")
    public void music_must_play() {
    musingLibraryPage.verifyThePauseButton();
    }
    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }
}
