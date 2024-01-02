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
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class TC5  extends BaseLaunchTest{
	
	@BeforeClass
	public void tc5_login() throws InterruptedException {
		LoginPage login = new LoginPage(driver, pr);
		login.signIn("email", "password");
		
	}
	
	@Test(description = "Login, Play, ChannelSub, Logout of YT") 
	public void playVideo() throws Exception {
		VideoPlayPage player1 = new VideoPlayPage(driver, pr);
		player1.playVideoLike();
		Thread.sleep(2000);
		
	}	
	
	@AfterClass
	public void tc5_logout() throws Exception {
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.signOut();
	}

}
