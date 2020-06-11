package com.erp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DriverBase {
	public WebDriver driver;
	public DriverBase(String browser) {
		SelectDriver se= new SelectDriver();
		this.driver = se.driverName(browser);
	}
	@Test
	public void get(String url) {
		driver.get(url);
	}
	
	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

}
