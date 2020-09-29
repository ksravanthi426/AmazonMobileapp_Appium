package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utilities.AbstractScreen;

import java.util.List;

public class HomePage extends AbstractScreen {

    private String sensorType;
    @AndroidFindBy(id = "io.appium.android.apis:id/orientation")
    private WebElement searchProduc;

   

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    private WebElement searchProductfromList;
    @AndroidFindBy(id = "(//*[@class='android.widget.ImageView'])[10]")
    private WebElement searchProduct;

    public HomePage(AndroidDriver driver) {
        super(driver);
        loadPage();
    }
public void searchProduct(){
	searchProduc.clear();
	searchProduc.sendKeys("Ball");
	
}
public void selectProductFromList(){
	searchProduct.click();
}
    
}