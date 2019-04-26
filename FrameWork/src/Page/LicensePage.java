package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LicensePage {

		private final String xp="//nobr[text()='Issue Date:']/../../td[2]";
		@FindBy(xpath=xp)
		private WebElement issuseDate;
		
		public LicensePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void verifyIssuseDate(String expected)
		{
			//String actual=issuseDate.getText();
			Reporter.log(issuseDate.getText(),true);
			Assert.assertEquals(issuseDate.getText(), expected);
		}
}
