package org.testing.TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testing.Base.BaseLaunchTest;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Report;
import org.testing.utilities.ScreenshotCapture;

public class TC1 extends BaseLaunchTest {
//	ExtentReports ex= Report.HandleReport();
//	ExtentTest extentTest=ex.startTest("TestCase1");
//	
	@BeforeClass
	public void tc1() throws Exception{
		LoginPage login = new LoginPage(driver,pr);
		login.signIn("email", "password");
		ScreenshotCapture.takeScreenShot(driver, "/Users/thangam/Downloads/Screenshots/tc1.png");
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");  //Hard Assert is provided by TestNG
		LogsCapture.takeLog("TestCase1","Login Successful");
	}

	@Test(priority=0)
    public void trending_click() throws Exception{
		HomePage home = new HomePage(driver,pr);
		home.trendingSelect();
		ScreenshotCapture.takeScreenShot(driver, "/Users/thangam/Downloads/Screenshots/tc1.1.png");
		LogsCapture.takeLog("TestCase1","Trending Selected");
	
	}
	
	@AfterClass
	public void tc1_logout() throws Exception {
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.signOut();
		LogsCapture.takeLog("TestCase1", "SignOut Complete");
	System.out.println("Succesfully driver closed");
	
//	extentTest.log(LogStatus.PASS, "Test Case1 is Passed");
//	ex.endTest(extentTest);
//	ex.flush(); // For Saving the Data
	}

}
