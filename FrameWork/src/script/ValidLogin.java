package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.EnterTimeTrackPage;
import Page.LoginPage;
import generic.BaseTest;
import generic.XL;

public class ValidLogin extends BaseTest{

	@Test(priority=1)
	public void testValidLogin()
	{
		String un=XL.getData(XL_PATH,"ValidLogin",1,0);
		String pw=XL.getData(XL_PATH,"ValidLogin",1,1);
		String title=XL.getData(XL_PATH,"ValidLogin",1,2);
		//Enter valid user name
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		//Enter valid password
		lp.setPwd(pw);
		//click login button
		lp.clickLogin();
		//verify home page is displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyPageisDiplayed(driver, ETO, title);
		//lp.VerifyErrMsgDisplayed();
	}

}
