package com.erp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		super(driver);
	}
	/*
	 * 获取用户名输入框
	 * */
	public WebElement getUserElement() {
		return element(GetByLocator.getLocator("username"));
	}
	
	/*
	 *获取密码输入框
	 * */
	public WebElement getPasswordElement() {
		return element(GetByLocator.getLocator("password"));
	}
	
	/*
	 * 获取登录按钮element
	 * */
	public WebElement getLoginButtonElement() {
		return element(GetByLocator.getLocator("loginbutton"));
	}
	/*
	 * 获取自动登录element
	 * */
	public WebElement getAtutoLoginElement() {
		return element(GetByLocator.getLocator("autologin"));
	}
	

}
