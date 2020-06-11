package com.erp.selenium;
/*
 * *操作层
 */
public class LoginPageHandle {
	public DriverBase driver;
	public LoginPage lp;
	public LoginPageHandle(DriverBase driver) {
		this.driver=driver;
		lp=new LoginPage(driver);
	}
	
	/*
	 * 输入用户名
	 * */
	public void sendKeysUser(String username) {
		lp.sendKey(lp.getUserElement(), username);
	}
	
	/*
	 * 输入密码
	 * */
	public void sendKeysPassword(String password) {
		lp.sendKey(lp.getPasswordElement(), password);
	}
	
	/*
	 * 点击登录
	 * */
	public void clickLoginButton () {
		lp.click(lp.getLoginButtonElement());
	}
	/*
	 * 点击自动登录
	 * */
	public void clickAutoLoginButton () {
		lp.click(lp.getAtutoLoginElement());
	}
	/*
	 * 判断是否是登录页面
	 * */
	public boolean assertLoginPage() {
		return lp.assertElementIs(lp.getUserElement());
	}
	

}
