package org.testing.TestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class directClick {

public void yt() throws InterruptedException {
	//Create a map to store  preferences 
	Map<String, Object> prefs = new HashMap<String, Object>();

	//add key and value to map as follow to switch off browser notification
	//Pass the argument 1 to allow and 2 to block
	prefs.put("profile.default_content_setting_values.notifications", 2);

	//Create an instance of ChromeOptions 
	ChromeOptions options = new ChromeOptions();

	// set ExperimentalOption - prefs 
	options.setExperimentalOption("prefs", prefs);
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//Subscriptions
	WebElement sub = driver.findElement(By.linkText("Subscriptions"));
	sub.click();
	driver.navigate().back();
//	
//	//Trending
//	WebElement trend = driver.findElement(By.linkText("Trending"));
//	trend.click();
//	System.out.println("Trending clicked");
//	driver.navigate().back();
	
	//Sign In to YT
//	WebElement signInButton = driver.findElement(By.xpath(
//			"//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
//	signInButton.click();
//
//	System.out.println("Email Field detected");
//	WebElement emailField = driver.findElement(By.xpath("//input[@type='email' and @id='identifierId']"));
//	emailField.sendKeys("Thangtrain10@gmail.com");
//	WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//	nextButton.click();
//	Thread.sleep(6000);
//	WebElement pwdField = driver.findElement(By.xpath("//input[@type='password']"));
//
//	pwdField.sendKeys("Testing*1n");
//	WebElement pwdNextButton = driver.findElement(By.id("passwordNext"));
//	Thread.sleep(6000);
//	pwdNextButton.click();
//	System.out.println("Password Entered");
//	
//	//Click Videos
//	Thread.sleep(6000);
//	WebElement video= driver.findElement(By.xpath("(//yt-formatted-string[@id='video-title'])[3]"));
//	video.click();
//	System.out.println("Video Clicked");
	

	//Log Out of YT
//		Thread.sleep(20000);
//		WebElement logout = driver.findElement(By.xpath("//button[@id='avatar-btn' and @class='style-scope ytd-topbar-menu-button-renderer']"));
//		logout.click();
//		Thread.sleep(2000);
//		WebElement signOut = driver.findElement(By.linkText("Sign out"));
//		signOut.click();
	    driver.close();
	
}
	public static void main(String[] args) {
		directClick obj = new directClick();
		try {
			obj.yt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
