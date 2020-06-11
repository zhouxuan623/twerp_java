package com.erp.selenium;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	public WebDriver driver;
	public WebDriver driverName(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
			return driver;
		}
		else {
			driver = new FirefoxDriver();
			return driver;
		}
	}
}
