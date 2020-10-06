package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.AbstractScreen;
import utilities.Log;

import java.util.List;

/**
 * Created by K Sravanthi on 28-09-2020.
 */
public class CartPage extends AbstractScreen {

    public CartPage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    WebElement productNameInCartPage ;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    WebElement productDescInCartPage ;
    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[5]")
    WebElement productPriceInCartPage ;
   
public void verifyAndStoreProductNameInCartPage(String expected){
	productNameInCartPage.isDisplayed();
	String actual=productNameInCartPage.getText();
	Assert.assertEquals(actual, expected);
}
public void verifyAndStoreProductDescInCartPage(String expected){
	productDescInCartPage.isDisplayed();
	String actual=productDescInCartPage.getText();
	Assert.assertEquals(actual, expected);
}
public void verifyAndStoreProductPriceInCartPage(String expected){
	productPriceInCartPage.isDisplayed();
	String actual=productPriceInCartPage.getText();
	Assert.assertEquals(actual, expected);
}

}

