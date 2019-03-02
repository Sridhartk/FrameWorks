package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPwd(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public void VerifyErrMsgDisplayed()
	{
	/*	boolean actual = errMsg.isDisplayed();
		Assert.assertEquals(actual, true);*/
		
		Assert.assertTrue(errMsg.isDisplayed());
	}
	
	
}
