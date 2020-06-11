package com.erp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasePage {
	public DriverBase driver;
	public BasePage(DriverBase driver) {
		this.driver = driver;
	}
	
	/*
	 * 定位元素
	 * */
	public WebElement element(By by) {
		return driver.findElement(by);
	}
	
	/*
	 * 封装点击
	 * */
	public void click(WebElement element) {
		if(element != null) {
			element.click();
		}else {
			System.out.println("元素没有定位到，点击失败");
		}
	}
	
	/*
	 * 输入
	 * */
	public void sendKey(WebElement element,String value) {
		if(element != null) {
			element.sendKeys(value);
		}
		else {
			System.out.println("元素没有定位到，输入失败");
		}
	}
	
	/*
	 * 判断元素是否显示
	 * */
	public boolean assertElementIs(WebElement element) {
		return element.isDisplayed();
	}
}
