package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepsDefined extends Base {
    @Given("i open the calculator")
    public void i_open_the_calculator() {
        calculatorPage.verifyAppLaunched();

    }
    @And("i click a digit number")
    public void i_click_a_digit_number() {
        calculatorPage.clickFirstDigit();

    }
    @And("i click multiplication sign")
    public void i_click_multiplication_sign() {
        calculatorPage.clickMultiplicationSign();

    }
    @And("i click second digit number")
    public void i_click_second_digit_number() {
        calculatorPage.clickSecondDigit();

    }
    @When("i click equals sign")
    public void i_click_equals_sign() {
        calculatorPage.clickEqualsSign();

    }
    @Then("the Total is displayed")
    public void the_total_is_displayed() {
        calculatorPage.returnDisplayedResults();
//        System.out.println(calculatorPage.returnDisplayedResults());

    }
}
