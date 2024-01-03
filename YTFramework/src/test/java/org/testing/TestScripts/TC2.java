package org.testing.TestScripts;

import org.testing.Base.BaseLaunchTest;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC2 extends BaseLaunchTest {
@BeforeClass
	public void signInYT() throws InterruptedException { // Home Page to click Sign In
		LoginPage login = new LoginPage(driver, pr);
		login.signIn("email", "password");

	}
@Test(priority=0)
	public void historySelect() throws InterruptedException {
		HomePage home = new HomePage(driver, pr);
		home.historySelect();
		LogsCapture.takeLog("TC2", "History Selected");
	}
@AfterClass
	public void logOutYT() throws Exception { // Logout of YT
		LogOutPage logout = new LogOutPage(driver, pr);
		logout.signOut();

	}
}
