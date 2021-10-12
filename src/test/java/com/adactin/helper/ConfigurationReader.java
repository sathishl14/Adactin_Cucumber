package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\91956\\eclipse-workspace\\adactin\\src\\test\\java\\com\\adactin\\helper\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	public String getbrowser() {
		String browser =p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url =p.getProperty("url");
		return url;
		
	}
	
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
		
	}
	

	public String getccn() {
		String ccn = p.getProperty("ccn");
		return ccn;
	}
	
	

}
