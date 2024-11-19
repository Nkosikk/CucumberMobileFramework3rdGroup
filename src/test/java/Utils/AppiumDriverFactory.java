package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.event.WindowStateListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverFactory {
    public static AppiumDriver driver;

    public static AppiumDriverFactory instanceOfAppiumDriverFactory;

    public AppiumDriverFactory() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
  //      capabilities.setCapability("appium:appium:app", System.getProperty("user.dir") + "/src/main/Apps/MT.apk");
        capabilities.setCapability("appium:appium:app", System.getProperty("user.dir") + "/src/main/Apps/Calculator.apk");
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static AppiumDriverFactory getInstanceOfAppiumDriverFactory(){
        if (instanceOfAppiumDriverFactory==null)
            instanceOfAppiumDriverFactory= new AppiumDriverFactory();
        return instanceOfAppiumDriverFactory;
    }

    public AppiumDriver getDriver(){
        return driver;
    }

}
