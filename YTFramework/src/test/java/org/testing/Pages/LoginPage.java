package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}

	//@Parameters({"url","email","password"})
	public void signIn(String email, String password) throws InterruptedException {

		//driver.get(url);
		Thread.sleep(2000);
		WebElement signInButton = driver.findElement(By.xpath(pr.getProperty("homePageSignInButton")));		
		signInButton.click();

		System.out.println("Email Field detected");
		Thread.sleep(2000);
		WebElement emailField = driver.findElement(By.xpath(pr.getProperty("emailField")));
		emailField.sendKeys("Thangtrain10@gmail.com");
		//emailField.sendKeys(email);
		WebElement nextButton = driver.findElement(By.xpath(pr.getProperty("nextButton")));
		nextButton.click();
		Thread.sleep(10000);
		WebElement pwdField = driver.findElement(By.xpath(pr.getProperty("pwdField")));
		pwdField.sendKeys("Testing*2n");
		//pwdField.sendKeys(password);
		WebElement pwdNextButton = driver.findElement(By.id(pr.getProperty("pwdNextButton")));
		pwdNextButton.click();
		System.out.println("Password Entered");

	}

}
