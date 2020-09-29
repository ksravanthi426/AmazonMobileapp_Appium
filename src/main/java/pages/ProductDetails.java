package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AbstractScreen;

/**
 * Created by K Sravanthi on 28-09-2020.
 */
public class ProductDetails extends AbstractScreen {
	@AndroidFindBy(id="bylineInfo")
	private WebElement productName;
    public ProductDetails(AndroidDriver driver) {
        super(driver);
        loadPage();
    }
    public void verifyAndStoreProductNameInPDP(String expected){
    	productName.isDisplayed();
    	 String actual=productName.getText();
    	 Assert.assertEquals(expected, actual);
    	 
    }
}
