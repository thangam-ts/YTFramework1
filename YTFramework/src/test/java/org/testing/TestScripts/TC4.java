package org.testing.TestScripts;

import org.testng.annotations.Test;
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
import org.testng.annotations.BeforeMethod;

public class TC4  extends BaseLaunchTest{
//Login, Play a video, Like , Logout
	@BeforeClass
	public void tc4_login() throws InterruptedException {
		LoginPage login = new LoginPage(driver, pr);
		login.signIn("email", "password");	
	}

	
	@Test(priority=0, description = "Login, Play, Like, Logout of YT") 
	public void playVideo() throws Exception {
		VideoPlayPage player1 = new VideoPlayPage(driver,pr);
		player1.playVideoLike();
		Thread.sleep(3000);
	}	
	
	@AfterClass
	public void tc4_logout() throws Exception {
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.signOut();
	}

}
