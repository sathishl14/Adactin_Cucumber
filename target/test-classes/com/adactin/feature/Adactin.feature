Feature: Testing Adactin application end to end process

Scenario Outline: Verify whether user able to login the application

Given User launch the application
When User enters the valid "<username>" in the username field
And  User enters the valid "<password>" in the password field
And  User clicks the login button
Then User verifies the home page navigates to search hotel

	Examples:
	|username|password|
	|AAA|111|
	|BBB|222|
	|CCC|333|


Scenario: Verify whether user able to login the application

Given User launch the application
When User enters the valid "sathish1490" in the username field
And  User enters the valid "sathish1490" in the password field
And  User clicks the login button
Then User verifies the home page navigates to search hotel

Scenario: Verify whether user able to search the hotel

Given User navigated to search hotel page
When User chooses the location from dropdown
And  User chooses the hotel from dropdown
And  User chooses the roomtype from dropdown
And  User chooses the number of rooms from dropdown
And  User enters the checkindate
And  User enters the checkoutdate
And  User chooses the number of adults from dropdown
And  User chooses the number of children from dropdown
And  User clicks the search hotel button
Then User verifies the home page navigates to select hotel

Scenario: Verify whether user able to select the hotel

Given User navigated to select hotel page
When User chooses the desired hotel
And  User clicks the search hotel button
Then User verifies the select hotel page and navigates to booking

Scenario: Verify whether user able to book a hotel

Given User navigated to book hotel page
When User enters the firstname
And User enters the lastname 
And User enters the billing address 
And User enters the credit card number
And User chooses the Type of credit card from dropdown 
And User chooses the expiry month of credit card from dropdown 
And User chooses the expiry year of credit card from dropdown 
And User enters the cvv number
And  User clicks the book now button
Then User verifies the book hotel page and navigates to booking confirmation page

Scenario: Verify whether user able to view the itenary

Given User navigated to booking confirmation page
And  User clicks the my itenary  button
Then User verifies the itenary and navigates to Booked Itinerary page
