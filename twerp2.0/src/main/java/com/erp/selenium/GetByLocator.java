package com.erp.selenium;

import org.openqa.selenium.By;

public class GetByLocator {
	public static By getLocator(String key) {
		ProUtil pro = new ProUtil("twerp.proterties");
		String locator = pro.getPro(key);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		if (locatorType.equals("id")) {
			return By.id(locatorValue);
		}else if(locatorType.equals("name")) {
			return By.name(locatorValue);
		}else if(locatorType.equals("classname")) {
			return By.className(locatorValue);
		}else {
			return By.xpath(locatorValue);
		}
	}

}
