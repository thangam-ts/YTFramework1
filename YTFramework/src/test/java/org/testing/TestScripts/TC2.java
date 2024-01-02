package org.testing.TestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC2 {

	WebDriver driver;

	public void signInYT() throws InterruptedException {   //Home Page to click Sign In

		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		 driver = new ChromeDriver(options);

		//Hit the URL and maximize the window
		driver.get("https://www.youtube.com");
		//driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println(a);
		Thread.sleep(5000);
		
		WebElement signInButton = driver.findElement(By.linkText("Sign in"));
		signInButton.click();

	}

	public void loginYT( String email, String password) throws InterruptedException{   //Login to YT
		System.out.println("Email Field detected");
		Thread.sleep(5000);
		WebElement emailField = driver.findElement(By.xpath("//input[@type='email' and @id='identifierId']"));
		emailField.sendKeys(email);
		Thread.sleep(5000);
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		Thread.sleep(5000);

		WebElement pwdField = driver.findElement(By.xpath("//input[@type='password']"));
		pwdField.sendKeys(password);
		WebElement pwdNextButton = driver.findElement(By.id("passwordNext"));
		pwdNextButton.click();
		System.out.println("Password Entered");
//		WebElement historyTab = driver
//				.findElement(By.xpath("(//a[@id='endpoint' and @title='History'])"));
//		historyTab.click();
		System.out.println("Title is " + driver.getTitle());
	}

//	public void historySelect() {
//		WebElement historyTab = driver
//				.findElement(By.xpath("(//a[@id='endpoint' and @title='History'])"));
//		historyTab.click();
//		System.out.println("Title is " + driver.getTitle());
//	}

	public void logOutYT() throws InterruptedException { //Logout of YT

		Thread.sleep(5000);
		
		WebElement avatarButton = driver.findElement(By.xpath("//img[@alt='Avatar image']"));
		//WebElement avatarButton = driver.findElement(By.xpath("//button[@id='avatar-btn' and @class='style-scope ytd-topbar-menu-button-renderer']"));
		avatarButton.click();
		Thread.sleep(5000);
		WebElement signOutButton = driver.findElement(By.linkText("Sign out"));
		signOutButton.click();
		System.out.println("Page Title is" + driver.getTitle());
	}
	public static void main(String[] args) {
		TC2 obj = new TC2();
		try {
			obj.signInYT();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			obj.loginYT("Thangtrain10@gmail.com", "Testing*1n");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//obj.historySelect();
		try {
			obj.logOutYT();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
