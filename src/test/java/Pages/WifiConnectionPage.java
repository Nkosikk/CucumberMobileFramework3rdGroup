package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WifiConnectionPage {


    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static By HostTextElement = By.id("com.telerik.testing.executionagent:id/ipAddressEditText");
    private static By PortTextElement = By.id("com.telerik.testing.executionagent:id/portEditText");
    private static By ConnectButtonElement = By.id("com.telerik.testing.executionagent:id/wifiConnectButton");
    private static By MessageElement = By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]");



    public WifiConnectionPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void enterHostText( String key){
        androidUtils.enterText(HostTextElement, key);
    }

    public void enterPortText( String key){
        androidUtils.enterText(PortTextElement, key);
    }

    public void clickConnect(){
        androidUtils.clickButton(ConnectButtonElement);
    }

    public void checkIfMessageIsDisplayed(){
        if (androidUtils.objectExist(MessageElement)) {
            Assert.assertTrue(true, "Message is displayed");
        } else {
            Assert.fail("Failed to display");
        }
    }
}
