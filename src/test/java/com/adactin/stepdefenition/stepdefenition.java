package com.adactin.stepdefenition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;  
import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class stepdefenition extends BaseClass{
	
	public static WebDriver driver =TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws IOException, InterruptedException {
		String url = FileReaderManager.getInstance().getInstanceCR().geturl();
		getUrl(url);
	}
	
	
	
	@When("User enters the valid {string} in the username field")
	public void user_enters_the_valid_in_the_username_field(String string) {
		inputValuesToElement(pom.getsp().getUsername(), string);
	}

	@When("User enters the valid {string} in the password field")
	public void user_enters_the_valid_in_the_password_field(String string) {
		inputValuesToElement(pom.getsp().getPassword(), string);
	}


	@When("^User clicks the login button$")
	public void user_clicks_the_login_button() {
		clickOnElement(pom.getsp().getLogin());
	    }

	@Then("User verifies the home page navigates to search hotel")
	public void user_verifies_the_home_page_navigates_to_search_hotel() {
	}
	
	@Given("User navigated to search hotel page")
	public void user_navigated_to_search_hotel_page() {
	}

	@When("User chooses the location from dropdown")
	public void user_chooses_the_location_from_dropdown() {
		SelectDropDown(pom.getSh().getLocation(),"2","index");
	}


	@When("User chooses the hotel from dropdown")
	public void user_chooses_the_hotel_from_dropdown() {
		SelectDropDown(pom.getSh().getHotels(),"2","index");
	}

	@When("User chooses the roomtype from dropdown")
	public void user_chooses_the_roomtype_from_dropdown() {
		SelectDropDown(pom.getSh().getRoom_type(),"2","index");
	}

	@When("User chooses the number of rooms from dropdown")
	public void user_chooses_the_number_of_rooms_from_dropdown() {
		SelectDropDown(pom.getSh().getRoom_nos(),"2","index");

	}

	@When("User enters the checkindate")
	public void user_enters_the_checkindate() {
		inputValuesToElement(pom.getSh().getDatepick_in(),"06/09/2021");
	}

	@When("User enters the checkoutdate")
	public void user_enters_the_checkoutdate() {
		inputValuesToElement(pom.getSh().getDatepick_out(),"07/09/2021");
	}

	@When("User chooses the number of adults from dropdown")
	public void user_chooses_the_number_of_adults_from_dropdown() {
		SelectDropDown(pom.getSh().getAdult_room(),"2","index");
	}

	@When("User chooses the number of children from dropdown")
	public void user_chooses_the_number_of_children_from_dropdown() {
		SelectDropDown(pom.getSh().getChild_room(),"2","index");

	}

	@When("User clicks the search hotel button")
	public void user_clicks_the_search_hotel_button() throws InterruptedException {
		clickOnElement(pom.getSh().getSubmit());
	}

	@Then("User verifies the home page navigates to select hotel")
	public void user_verifies_the_home_page_navigates_to_select_hotel() {
	    
	}

	@Given("User navigated to select hotel page")
	public void user_navigated_to_select_hotel_page() throws InterruptedException {
		clickOnElement(pom.getSe().getRadiobutton_0());

	}
	

	@When("User chooses the desired hotel")
	public void user_chooses_the_desired_hotel() {
		clickOnElement(pom.getSe().getContinue());
		
	}

	@Then("User verifies the select hotel page and navigates to booking")
	public void user_verifies_the_select_hotel_page_and_navigates_to_booking() {
		 
	}


	@Given("User navigated to book hotel page")
	public void user_navigated_to_book_hotel_page() {
	}

	@When("User enters the firstname")
	public void user_enters_the_firstname() {
		inputValuesToElement(pom.getBh().getFirst_name(), "sathish");
	}

	@When("User enters the lastname")
	public void user_enters_the_lastname() {
		inputValuesToElement(pom.getBh().getLast_name(), "Lakshmanan");
	}

	@When("User enters the billing address")
	public void user_enters_the_billing_address() {
		inputValuesToElement(pom.getBh().getAddress(), "chennai");
	}

	@When("User enters the credit card number")
	public void user_enters_the_credit_card_number() throws IOException {
		String ccn = FileReaderManager.getInstance().getInstanceCR().getccn();
		inputValuesToElement(pom.getBh().getCc_num(), ccn);
	}

	@When("User chooses the Type of credit card from dropdown")
	public void user_chooses_the_type_of_credit_card_from_dropdown() {
		SelectDropDown(pom.getBh().getCc_type(),"2", "index");
	}

	@When("User chooses the expiry month of credit card from dropdown")
	public void user_chooses_the_expiry_month_of_credit_card_from_dropdown() {
		SelectDropDown(pom.getBh().getCc_exp_month(),"2", "index");
	}

	@When("User chooses the expiry year of credit card from dropdown")
	public void user_chooses_the_expiry_year_of_credit_card_from_dropdown() {
		SelectDropDown(pom.getBh().getCc_exp_year(),"2", "index"); 
	}

	@When("User enters the cvv number")
	public void user_enters_the_cvv_number() throws IOException {
		String cvv = FileReaderManager.getInstance().getInstanceCR().getcvv();
		inputValuesToElement(pom.getBh().getCc_cvv(), cvv);
	}

	@When("User clicks the book now button")
	public void user_clicks_the_book_now_button() throws InterruptedException {
		clickOnElement(pom.getBh().getBook_now());
		Thread.sleep(6000);
		
	}

	@Then("User verifies the book hotel page and navigates to booking confirmation page")
	public void user_verifies_the_book_hotel_page_and_navigates_to_booking_confirmation_page() {   
	}

	@Given("User navigated to booking confirmation page")
	public void user_navigated_to_booking_confirmation_page() {    
	}

	@Given("User clicks the my itenary  button")
	public void user_clicks_the_my_itenary_button() {
		clickOnElement(pom.getBi().getMy_itinerary());
	}

	@Then("User verifies the itenary and navigates to Booked Itinerary page")
	public void user_verifies_the_itenary_and_navigates_to_booked_itinerary_page() {  
	}


 
	
	
}

