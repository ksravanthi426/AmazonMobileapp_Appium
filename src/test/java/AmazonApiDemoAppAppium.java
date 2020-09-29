import pages.*;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.TestSetup;

import java.io.IOException;

public class AmazonApiDemoAppAppium {
    private AndroidDriver driver;
    private LogintoApp loginScreen;
    private ProductDetails productDetail;
    private HomePage homepage;
   

    @AfterMethod
    public void afterMethod() {
    }

    @BeforeClass(alwaysRun = true)
    public void initAutomation() throws IOException {
        TestSetup.loadConfigProp("config_apidemo_test_app.properties");
        TestSetup.setCapabilities();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        driver = TestSetup.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

    @Test(groups = { "Smoke" }, enabled = true)
    public void testAppActivity() {
    	
    	loginScreen = new LogintoApp(driver);
    	loginScreen.veriyLoginBtnIsSelected();
    	loginScreen.logintoApp("ksravanthi", "Admin123");
         productDetail.verifyAndStoreProductNameInPDP("ProductName");
         homepage.searchProduct();
         homepage.selectProductFromList();
         
        
    }
}