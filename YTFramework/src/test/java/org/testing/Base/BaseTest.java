package org.testing.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	WebDriver driver;

	public void openBrowser(String browser, String weburl) {

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("safari"))
			driver = new SafariDriver();
		else {
			System.out.println("Valid Browser is not Provided");
			System.exit(0);
		}
		if (weburl != "") {
			driver.get(weburl);
		} else
			driver.get("about:blank");
	}

	public void closeSession() {
		driver.close();
		System.out.println("Browser Closed");
	}

}
