package com.erp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		super(driver);
	}
	/*
	 * ��ȡ�û��������
	 * */
	public WebElement getUserElement() {
		return element(GetByLocator.getLocator("username"));
	}
	
	/*
	 *��ȡ���������
	 * */
	public WebElement getPasswordElement() {
		return element(GetByLocator.getLocator("password"));
	}
	
	/*
	 * ��ȡ��¼��ťelement
	 * */
	public WebElement getLoginButtonElement() {
		return element(GetByLocator.getLocator("loginbutton"));
	}
	/*
	 * ��ȡ�Զ���¼element
	 * */
	public WebElement getAtutoLoginElement() {
		return element(GetByLocator.getLocator("autologin"));
	}
	

}
