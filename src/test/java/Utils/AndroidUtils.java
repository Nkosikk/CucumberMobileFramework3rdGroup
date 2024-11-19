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

    public void enterDataUsingHostKeys(By by){
        driver.findElement(by).sendKeys("127.0.0.1");
    }
    public void enterDataUsingPortKeys(By by){
        driver.findElement(by).sendKeys("4723");
    }
    public void getErrorDisplayed(By by){
        driver.findElement(by).getText();
    }
    public void getDisplayedResults(By by){
        driver.findElement(by).getText();
    }
}
