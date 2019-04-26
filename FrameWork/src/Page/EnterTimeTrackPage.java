package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	//private final String xp="(//div[contains(text(),'Settings')])[1]";
	@FindBy(xpath="(//div[contains(text(),'Settings')])[1]")
	private WebElement settings1;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicksettings()
	{
		settings1.click();
	}
	
	public void clickLicenses()
	{
		licenses.click();
	}
	
	public void verifyPageisDiplayed(WebDriver driver,long time,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is Displayed", true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Homepage is not displayed",true);
			Assert.fail();
		}
	}
}
