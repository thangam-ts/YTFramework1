package org.testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownHandling {
	WebDriver driver;
	
	public void dropDownUsingIndex() {
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByIndex(3);
	}

public void dropDownByValue() {
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByValue("10");
	}

public void dropDownByVisibleText() {
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByVisibleText("ANTARCTICA");
}

}
