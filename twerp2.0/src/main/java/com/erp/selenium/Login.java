package com.erp.selenium;
/*
 * ������
 * */
//public class Login {
//	public CaseBase driver;
//	public Login() {
//		CaseBase driver=new CaseBase();
//		driver.initDriver("chrome");	
//	}
//
//}

public class Login extends CaseBase{
	public DriverBase driver;
	public LoginPro loginPro;
	public Login() {
		this.driver=initDriver("chrome");
		loginPro = new LoginPro(driver);  //driver����ȥ����֤��ͬһ��driver
	}
	
	public void testLogin() {
		loginPro.login("123","1233");
	}

}
