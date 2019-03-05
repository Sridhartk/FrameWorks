package script;

import org.testng.annotations.Test;

import Page.EnterTimeTrackPage;
import Page.LicensePage;
import Page.LoginPage;
import generic.BaseTest;
import generic.XL;

public class CheckIssuseDate extends BaseTest {
	
	@Test
	public void testIssuseDate() {
	String un=XL.getData(XL_PATH, "CheckIssuseDate", 1, 0);
	String pw=XL.getData(XL_PATH, "CheckIssuseDate", 1, 1);
	String iDate=XL.getData(XL_PATH, "CheckIssuseDate", 1, 2);
	
	
	LoginPage l=new LoginPage(driver);
	//Enter Valid user name
	l.setUserName(un);
	//Enter Valid password
	l.setPwd(pw);
	//click login

	l.clickLogin();
	
	EnterTimeTrackPage ETT=new EnterTimeTrackPage(driver);
	ETT.clicksettings();
	//verify license
	ETT.clickLicenses();
	
	
	//verify issuse date
	LicensePage li=new LicensePage(driver);
	li.verifyIssuseDate(iDate);

	
}
}