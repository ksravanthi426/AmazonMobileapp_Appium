import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.*;
import pages.CartPage;
import utilities.TestSetup;

import java.io.IOException;

/**
 * Created by K Sravanthi on 28-09-2020.
 */

public class Test1 extends TestSetup {
    private AndroidDriver driver;
//    private String sTestCaseName;
    CartPage cartpg;

    static {
        // Disable annoying cookie warnings.
        // WARNING: Invalid cookie header
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
    }

    @AfterMethod
    public void afterMethod() {
        driver.resetApp();
//        Log.endTestCase(sTestCaseName);
}

    @BeforeClass(alwaysRun = true)
    public void initAutomation() throws IOException {
        TestSetup.loadConfigProp("config_android_settings.properties");
        TestSetup.setCapabilities();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        driver = TestSetup.getDriver();
//        sTestCaseName = this.toString();
//        sTestCaseName = Utils.getTestCaseName(this.toString());
//        Log.startTestCase(sTestCaseName);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {

        if(driver != null)
            driver.quit();
    }

    @Test(groups = {"unit"}, priority = 1)
    public void VerifyScreen() throws Exception {
        Thread.sleep(3000);
        cartpg = new CartPage(driver);
       
//        Log.info("Verify Splash Screen ...");
    }
}


