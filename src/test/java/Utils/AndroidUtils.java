package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidUtils {

    private AppiumDriver driver;

    public AndroidUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public Boolean objectExist(By by) {
        if (driver.findElements(by).size() == 0) {
            assert false;
            return false;
        } else {
            assert true;
            return true;
        }
    }

    public void clickButton(By by) {
        driver.findElement(by).click();
    }

    public void enterKeys(By by){
        driver.findElement(by).sendKeys();
    }
}
