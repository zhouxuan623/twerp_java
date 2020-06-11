package com.erp.selenium;
/*
 * *������
 */
public class LoginPageHandle {
	public DriverBase driver;
	public LoginPage lp;
	public LoginPageHandle(DriverBase driver) {
		this.driver=driver;
		lp=new LoginPage(driver);
	}
	
	/*
	 * �����û���
	 * */
	public void sendKeysUser(String username) {
		lp.sendKey(lp.getUserElement(), username);
	}
	
	/*
	 * ��������
	 * */
	public void sendKeysPassword(String password) {
		lp.sendKey(lp.getPasswordElement(), password);
	}
	
	/*
	 * �����¼
	 * */
	public void clickLoginButton () {
		lp.click(lp.getLoginButtonElement());
	}
	/*
	 * ����Զ���¼
	 * */
	public void clickAutoLoginButton () {
		lp.click(lp.getAtutoLoginElement());
	}
	/*
	 * �ж��Ƿ��ǵ�¼ҳ��
	 * */
	public boolean assertLoginPage() {
		return lp.assertElementIs(lp.getUserElement());
	}
	

}
