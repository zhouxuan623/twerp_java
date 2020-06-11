package com.erp.selenium;
/*
 * ҵ���
 * */
public class LoginPro {
	public LoginPageHandle lph;
	public LoginPro(DriverBase driver) {
		lph=new LoginPageHandle(driver);
	}
	
	public void login(String username,String password) {
		if(lph.assertLoginPage()) {			
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			lph.clickAutoLoginButton();
			lph.clickLoginButton();
			lph.lp.assertElementIs(lph.lp.getUserElement());
		}else {
			System.out.println("ҳ�治���ڻ���״̬����ȷ");
		}
	}
}
