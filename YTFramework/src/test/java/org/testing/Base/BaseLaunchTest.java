package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseLaunchTest {

	public ChromeDriver driver;
	public Properties pr;

	@BeforeClass
	public void browserLaunch() throws IOException {
		//To Load the properties file in the base class
		File f= new File("../YTFramework/ObjectRepo.properties");
		FileInputStream fr = new FileInputStream(f);
		pr = new Properties();
		pr.load(fr);		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// creating object for DesiredCapabilities
		DesiredCapabilities incgBrowserMode = new DesiredCapabilities();
		incgBrowserMode.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(incgBrowserMode);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
	}


	@AfterClass
	public void closeSession() {
		System.out.println("Browser is closed");
		driver.close();
		driver = null;  // To remove cache
	}
}