package com.adactin.pom;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItenary {
	
	public static WebDriver driver;

	
	public BookedItenary(WebDriver driver2) {
		SignInPage.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	@FindBy(id ="my_itinerary")
	private WebElement my_itinerary;


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
		
}

	

