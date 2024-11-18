package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static By WIfiButton = By.id("com.telerik.testing.executionagent:id/wifiConnectionButton");
    private static By errorMessage = By.id("android:id/message");
    private static By closeMessageOK = By.id("android:id/button2");

    public LandingPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void verifyAppLaunched() {
        if (androidUtils.objectExist(WIfiButton)) {
            Assert.assertTrue(true, "App is launched successful");
        } else {
            Assert.fail("App not launched successful");
        }
    }

    public void clickWifiButton(){
        androidUtils.clickButton(WIfiButton);
    }

    public void verifyDisplayedErrorMessage(){
        androidUtils.getErrorDisplayed(errorMessage);
    }
    public void  clickOK(){
        androidUtils.clickButton(closeMessageOK);
    }


}
