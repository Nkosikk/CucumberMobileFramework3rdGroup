package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WifiConnectionPage {
    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    public WifiConnectionPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void verifyWifiConnectionPage() {
        if (androidUtils.objectExist(WIfiButton)) {
            Assert.assertTrue(true, "App is launched successful");
        } else {
            Assert.fail("App not launched successful");
        }
    }

}
