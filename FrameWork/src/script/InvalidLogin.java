package script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.XL;
import Page.LoginPage;

public class InvalidLogin extends BaseTest{
@Test(priority=2)
public void testInvalidLogin() throws InterruptedException {
	int rc = XL.getRowCount(XL_PATH, "InvalidLogin");
	Reporter.log("RowCount:"+rc,true);
	
	for(int i=1;i<=rc;i++) {
	String un=XL.getData(XL_PATH, "InvalidLogin",i,0);
	String pw=XL.getData(XL_PATH, "InvalidLogin",i,1);
	Reporter.log("UN:"+un,true);
	Reporter.log("PW:"+pw,true);
	//Enter invalid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter invalid password
	l.setPwd(pw);
	//Click login
	l.clickLogin();
	//Verify Err Msg is Disaplayed
	Thread.sleep(1000);
	l.VerifyErrMsgDisplayed();
	Thread.sleep(1000);
	}
}
}