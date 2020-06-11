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
	 * ��λԪ��
	 * */
	public WebElement element(By by) {
		return driver.findElement(by);
	}
	
	/*
	 * ��װ���
	 * */
	public void click(WebElement element) {
		if(element != null) {
			element.click();
		}else {
			System.out.println("Ԫ��û�ж�λ�������ʧ��");
		}
	}
	
	/*
	 * ����
	 * */
	public void sendKey(WebElement element,String value) {
		if(element != null) {
			element.sendKeys(value);
		}
		else {
			System.out.println("Ԫ��û�ж�λ��������ʧ��");
		}
	}
	
	/*
	 * �ж�Ԫ���Ƿ���ʾ
	 * */
	public boolean assertElementIs(WebElement element) {
		return element.isDisplayed();
	}
}
