package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//base class
public abstract class BaseTest implements IAutoConst{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
}
