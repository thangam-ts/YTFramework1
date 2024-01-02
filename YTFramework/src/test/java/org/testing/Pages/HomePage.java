package org.testing.Pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	ChromeDriver driver;
	Properties pr;
	
	public HomePage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
//Clicking on Trending 
	public void trendingSelect() throws InterruptedException {	
		System.out.println("Trending Found1");
		Thread.sleep(40000);	
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
		Thread.sleep(5000);
		trending.click();
		System.out.println("Trending click Test succesfull");
	}
	
	//Clicking on Subscription
		public void subscriptionSelect() throws InterruptedException {	
			System.out.println("Subscription Found");
			Thread.sleep(40000);	
			WebElement trending = driver.findElement(By.xpath(pr.getProperty("subscription_section")));
			Thread.sleep(5000);
			trending.click();
			System.out.println("subscription click Test succesfull");	
		}
			
	//Clicking Watch Later
		public void watchLaterSelect() throws InterruptedException {	
			System.out.println("Watch later Found");
			Thread.sleep(40000);	
			WebElement watchLater =this.driver.findElement(By.xpath(pr.getProperty("watch_Later_Section")));
			Thread.sleep(15000);
			watchLater.click();
			System.out.println("watch Later click Test succesfull");			

}
		
	//Clicking Library
		public void librarySelect() throws InterruptedException {	
			System.out.println("Library Found");
			Thread.sleep(40000);	
			WebElement library_button =this.driver.findElement(By.xpath(pr.getProperty("library_Section")));
			Thread.sleep(15000);
			library_button.click();
			System.out.println("Library click Test succesfull");			

}
}