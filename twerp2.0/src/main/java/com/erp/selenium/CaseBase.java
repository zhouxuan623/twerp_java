package com.erp.selenium;

public class CaseBase {
	public DriverBase initDriver(String browser) {
		DriverBase driver = new DriverBase(browser);
		return driver;
	}
}
