package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WifiConnectionPage {


    AppiumDriver driver;
    //AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static By HostTextElement = By.id("com.telerik.testing.executionagent:id/ipAddressEditText");
    private static By PortTextElement = By.id("com.telerik.testing.executionagent:id/portEditText");



    public WifiConnectionPage() {
        //driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void enterHostText( String key){
        androidUtils.enterText(HostTextElement, key);
    }

//    public void enterHostText(String hostText){
//
//        if (androidUtils.objectExist(HostTextElement)) {
//            androidUtils.enterHost(HostTextElement,hostText);
//        } else {
//            Assert.fail("App not launched successful");
//        }
//
//    }



}
