package pomtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pompage.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void login()
	{
		Reporter.log("login test", true);
		lp.loginWithCorrectCred();
	}
	

}
