
Feature: Logging into saucedemo website
Description: The purpose of this feature is to test Login functionality of saucedemo website

  Scenario: Succesfully logging into saucedemo website
    Given user is on login page of website
    And title of page is as expected
    And username field is visible
    And password field is visible
    When user enters valid username
    And user enters valid password
    Then website successfully logs in
    And products page is displayed

	Scenario: Error message displayed after inputting invalid data
		Given user is on login page of website
		When user enters invalid username and password
		Then error message should be displayed on page
