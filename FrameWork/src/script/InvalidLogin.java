package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Page.LoginPage;
import generic.BaseTest;
import generic.XL;

public class InvalidLogin extends BaseTest{
	@Test
	public void Invalidtestlogin() throws InterruptedException {
	int rc=XL.getRowCount(XL_PATH, "InvalidLogin");
			Reporter.log("Rowcount "+rc,true);
	for(int i=1;i<=rc;i++)
	{
		String un=XL.getData(XL_PATH, "InvalidLogin", i, 0);
		String pw=XL.getData(XL_PATH, "InvalidLogin", i, 1);
		Reporter.log("UN"+un, true);
		Reporter.log("PW"+un, true);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		lp.setPwd(pw);
		lp.clickLogin();
		Thread.sleep(2000);
		lp.VerifyErrMsgDisplayed();
		Thread.sleep(2000);
	}
}

}