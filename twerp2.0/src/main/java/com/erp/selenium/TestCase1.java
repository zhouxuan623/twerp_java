package com.erp.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends CaseBase{
	public DriverBase driver;
	public BasePage bPage;
	public TestCase1() {
		this.driver=initDriver("chrome");
		bPage = new BasePage(driver);
	}
	
	@Test
	public void tmSi() {
		driver.get("http://www.baidu.com");
//		bPage.sendKey(By.id("kw"), "test");
		
	}
}
