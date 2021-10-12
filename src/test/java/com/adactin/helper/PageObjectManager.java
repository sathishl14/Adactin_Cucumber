package com.adactin.helper;

import org.openqa.selenium.WebDriver;   

import com.adactin.pom.BookHotel;
import com.adactin.pom.BookedItenary;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;
import com.adactin.pom.searchHotel;
 
public class PageObjectManager {

	public static WebDriver driver;
	
	private SignInPage sp;
	private searchHotel sh;
	private SelectHotel se;
	private BookHotel bh;
	private BookedItenary bi;
	

	public BookedItenary getBi() {
		bi = new BookedItenary(driver);
		return bi;
	}

	public PageObjectManager(WebDriver driver2) {
	PageObjectManager.driver=driver2;
	}
	
	public SignInPage getsp() {
		sp = new SignInPage(driver);
		return sp;
	}
	public searchHotel getSh() {
		sh = new searchHotel(driver);
		return sh;
	}
	
	public SelectHotel getSe() {
		se = new SelectHotel(driver);
		return se;
	}
	
	public BookHotel getBh() {
		bh = new BookHotel(driver);
		return bh;
	}


	}
	
