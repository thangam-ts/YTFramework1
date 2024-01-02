package org.testing.TestScripts;

import org.testing.Base.BaseLaunchTest;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC3 extends BaseLaunchTest{
//Login, click on Subscriptions, logout
	
	@BeforeClass
	public void tc3_login() throws Exception{
		LoginPage login = new LoginPage(driver,pr);
		login.signIn("email", "password");
	}
	
	@Test(priority=0)
	public void tc3_subscriptionClick() throws Exception{
		HomePage sub = new HomePage(driver,pr);
		sub.subscriptionSelect();
	}
	
	
	@AfterClass
	public void tc3_logout() throws Exception {
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.signOut();
		System.out.println("Driver closed successfully");
	}
	
}
