package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CalculatorPage {
    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static By selectFirstDigit = By.id("com.google.android.calculator:id/digit_7");
    private static By selectMultiplySign = By.id("com.google.android.calculator:id/op_mul");
    private static By selectSecondDigit = By.id("com.google.android.calculator:id/digit_6");
    private static By selectEqualsSign = By.id("com.google.android.calculator:id/eq");
    private static By displayedResults = By.id("com.google.android.calculator:id/result_final");

    public  CalculatorPage(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);
    }
    public void verifyAppLaunched() {
        if (androidUtils.objectExist(selectEqualsSign)) {
            Assert.assertTrue(true, "App is launched successful");
        } else {
            Assert.fail("App not launched successful");
        }
    }
    public void clickFirstDigit(){
        androidUtils.clickButton(selectFirstDigit);
    }
    public void clickMultiplicationSign(){
        androidUtils.clickButton(selectMultiplySign);
    }
    public void clickSecondDigit(){
        androidUtils.clickButton(selectSecondDigit);
    }
    public void clickEqualsSign(){
        androidUtils.clickButton(selectEqualsSign);
    }
    public void returnDisplayedResults(){
        androidUtils.getDisplayedResults(displayedResults);

    }
}
