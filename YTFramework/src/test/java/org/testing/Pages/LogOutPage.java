package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogOutPage {

	ChromeDriver driver;
	Properties pr;
	public LogOutPage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}

	public void signOut() throws Exception {
	Thread.sleep(20000);
	WebElement logout = driver.findElement(By.xpath(pr.getProperty("logout")));
	Actions action = new Actions(driver);
	action.moveToElement(logout).click().build().perform();
	
	Thread.sleep(2000);
	WebElement signOut = driver.findElement(By.linkText(pr.getProperty("signOut")));
	action.moveToElement(signOut).click().build().perform();
}
}
