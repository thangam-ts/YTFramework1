package org.testing.Pages;

import java.awt.Robot;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlayPage {
	
	ChromeDriver driver;
	Properties pr;
	
	public VideoPlayPage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	//Play any Video and tapping LIKE button
	public void playVideoLike() throws Exception {
		Thread.sleep(20000);
		System.out.println("Video player section started");
		WebElement videoTitle =driver.findElement(By.xpath(pr.getProperty("videoTitleClick")));
		videoTitle.click();
		Thread.sleep(20000);
		
	
		WebElement likeButton = driver.findElement(By.xpath(pr.getProperty("like_button")));
		likeButton.click();
		System.out.println("Video player section Ended");
		
//		Actions action = new Actions(driver);
//		action.moveToElement(videoTitle).click().build().perform();
//		action.moveToElement(likeButton).click().build().perform();

	}


	//Play any Video and commenting on any Video
	public void playVideoComment() throws Exception {
		Thread.sleep(20000);
		System.out.println("Video player section started");
		WebElement videoTitle =driver.findElement(By.xpath(pr.getProperty("videoTitleClick")));
		videoTitle.click();
		Thread.sleep(8000);
		
		//scroll the page to find the comment xpath locator
//    	Thread.sleep(3000);
		WebElement Element=driver.findElement(By.xpath(pr.getProperty("select_Comment")));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("window.scrollBy(0,500)");
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    	
//    	Robot robo = new Robot();
//    	robo.mouseWheel(10);
    	
    	WebElement comment=driver.findElement(By.xpath(pr.getProperty("select_Comment")));
		comment.click();
		
    	Thread.sleep(5000);
    	WebElement commentVideo = driver.findElement(By.xpath(pr.getProperty("video_Comment")));
    	Thread.sleep(5000);
    	commentVideo.sendKeys("Nice Content");
    	WebElement postComment = driver.findElement(By.xpath(pr.getProperty("video_Comment_Send")));
    	Thread.sleep(5000);
    	postComment.click();
    	
	
	}
	
	
}
