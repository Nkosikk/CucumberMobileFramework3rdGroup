package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class WifiConnectionPage {
    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private final By hostTextField = By.id("com.telerik.testing.executionagent:id/ipAddressEditText");
    private final By portTextField = By.id("com.telerik.testing.executionagent:id/portEditText");
    private final By clickConnectWifi = By.id("com.telerik.testing.executionagent:id/wifiConnectButton");

    public WifiConnectionPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);


//            driver.findElement(hostTextField).sendKeys("127.0.0.1");
//            driver.findElement(portTextField).sendKeys("4723");
//            driver.findElement(clickConnectWifi).click();


    }
    public void enterHostDetails(){
        androidUtils.enterDataUsingHostKeys(hostTextField);

    }

    public void enterPortDetails(){
        androidUtils.enterDataUsingPortKeys(portTextField);
    }
    public void clickConnect(){
        androidUtils.clickButton(clickConnectWifi);
    }

}
