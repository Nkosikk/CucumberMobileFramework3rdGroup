package Pages;

import Utils.AndroidUtils;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MusingLibraryPage {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static  By pageTitle = By.xpath("//android.widget.TextView[@text=\"UAMP\"]");
    private  static  By WakeUpElement = By.xpath("(//android.widget.ImageView[@resource-id=\"com.example.android.uamp.next:id/item_state\"])[1]");
    private static By GeishaElement = By.xpath("(//android.widget.ImageView[@resource-id=\"com.example.android.uamp.next:id/item_state\"])[2]");
    private static By AllowElement = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    private static By PauseButtonElement =By.xpath("(//android.widget.ImageView[@resource-id=\"com.example.android.uamp.next:id/item_state\"])[2]");

    public MusingLibraryPage() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        PageFactory.initElements(driver, this);

    }

    public void verifyAppLaunched() {
        if (androidUtils.objectExist(pageTitle)) {
            Assert.assertTrue(true, "App is launched successful");
        } else {
            Assert.fail("App not launched successful");
        }
    }


   public void clickWakeUpButton(){
       androidUtils.clickButton(WakeUpElement);
   }

   public  void clickGeishaButton(){
        androidUtils.clickButton(GeishaElement);
   }

   public void clickAllowButton(){
        androidUtils.clickButton(AllowElement);
   }

   public void verifyThePauseButton(){
       if (androidUtils.objectExist(PauseButtonElement)) {
           Assert.assertTrue(true, "Geisha song is successful playing");
       } else {
           Assert.fail("Geisha song is not playing");
       }
   }

   public void clickPauseButton(){
        androidUtils.clickButton(PauseButtonElement);
   }

}
