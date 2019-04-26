package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import Page.EnterTimeTrackPage;
import Page.LicensePage;
import Page.LoginPage;

public class CheckIssuseDate extends BaseTest{
@Test(priority=3)
public void testIssueDate() throws InterruptedException {
	String un=XL.getData(XL_PATH,"CheckIssuseDate",1,0);
	String pw=XL.getData(XL_PATH, "CheckIssuseDate", 1,1);
	String iDate=XL.getData(XL_PATH,"CheckIssuseDate", 1,2);
	//Enter valid user name
	LoginPage l=new LoginPage(driver);
	Thread.sleep(500);
	l.setUserName(un);
	//Enter valid password
	l.setPwd(pw);
	//click on login button
	l.clickLogin();
	
	
	//Click Settings	
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	Thread.sleep(5000);
	e.clicksettings();
	
	//Click Licenses
	Thread.sleep(2000);
	e.clickLicenses();
	
	
	//Verify IssueDate
	Thread.sleep(2000);
	LicensePage license=new LicensePage(driver);
	Thread.sleep(5000);
	license.verifyIssuseDate(iDate);
	Thread.sleep(2000);
}
}