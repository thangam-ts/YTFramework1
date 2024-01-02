package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.BaseLaunchTest;
import org.testing.Base.BaseTest;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TC7  extends BaseLaunchTest{
	
	@BeforeClass
	public void tc4_login() throws InterruptedException {
		LoginPage login = new LoginPage(driver, pr);
		login.signIn("email", "password");
		
	}
	
	@Test(description = "Login, click Watch Later, Logout of YT") 
	public void watchLater() throws Exception {
	HomePage player1 = new HomePage(driver, pr);
	player1.watchLaterSelect();
	}	
	
	@AfterClass
	public void tc4_logout() throws Exception {
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.signOut();
	}
}