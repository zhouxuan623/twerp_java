package com.erp.selenium;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.chainsaw.Main;

public class ProUtil {
	private Properties prop;
	private String filePath;
	public ProUtil(String filePath) {
		this.filePath = filePath;
		this.prop = readProperties();
	}
	
	/*
	 * ��ȡ�����ļ�
	 * */
	private Properties readProperties(){
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			BufferedInputStream in= new BufferedInputStream(inputStream);
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}
	public String getPro(String key) {
		if (prop.containsKey(key)) {
			String username = prop.getProperty(key);
			return username;
			}
		else {
			System.out.println("��ȡ��keyֵ����");
			return "";
		}

	}
	public static void main(String[] args) { 
		ProUtil proUtil = new ProUtil("twerp.properties") ;
		System.out.println(proUtil.getPro("username"));
	}
	
//	public String getPro(String key) throws Exception {
//		Properties prop = new Properties();
//		InputStream in = new BufferedInputStream(new FileInputStream(filePath));
//		prop.load(in);
//		String
//	}

}
