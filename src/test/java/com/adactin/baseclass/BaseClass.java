package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}
	
			//getUrl
			public static void getUrl(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			
		//inputValuesToElement
		public static void inputValuesToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		}
		
		//clickOnElement
		public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
		//explicitWait
		public static void explicitWait(WebElement element) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		//SelectDropDown
		public static void SelectDropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
		else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
			
		}
	}
	
	}



////explicitWait
//public static void explicitWait(WebElement element) {
//	try {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(element));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//
