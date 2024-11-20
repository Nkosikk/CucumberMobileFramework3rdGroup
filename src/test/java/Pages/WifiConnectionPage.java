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
    private static By ConnectBtnElement = By.id("com.telerik.testing.executionagent:id/wifiConnectButton");
    private static By alertTitleElement = By.id("android:id/alertTitle");
    private static By messageElement = By.id("android:id/message");
    private static By button2Element = By.id("android:id/button2");


    public WifiConnectionPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void enterHostText(String key) {
        androidUtils.enterText(HostTextElement, key);
    }

    public void enterPortText(String key) {
        androidUtils.enterText(PortTextElement, key);
    }

    public void clickConnectButton() {
        androidUtils.clickButton(ConnectBtnElement);
    }


    public void verifyErrorMessageText() {
        String errorTitle = androidUtils.getText(messageElement);

        Assert.assertEquals(errorTitle, "The WIFI input data is invalid, or is incompatible with Mobile Testing.");
        System.out.println(errorTitle);
    }

    public void clickOkButton(){
        androidUtils.clickButton(button2Element);
    }

}
