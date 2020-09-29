package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AbstractScreen;

/**
 * Created by K Sravanthi on 28-09-2020.
 */

public class LogintoApp extends AbstractScreen{
	@AndroidFindBy(id="Login.LoginRadioButton.Id")
	private WebElement loginbtn;
	@AndroidFindBy(id="Login.UserName.Id")
	private WebElement userName;
	@AndroidFindBy(id="Login.UserName.Id")
	private WebElement passWord;
	@AndroidFindBy(id="Login.Continue.Xpath")
	private WebElement continueBtn;
    public LogintoApp(AndroidDriver driver) {
        super(driver);
        loadPage();
        
    }
    
    public void veriyLoginBtnIsSelected(){
    	Assert.assertEquals(loginbtn.isEnabled(), true);
    }
    public void logintoApp(String username,String password){
    	userName.sendKeys(username);
    	passWord.sendKeys(password);
    	continueBtn.click();
    }
    
}
