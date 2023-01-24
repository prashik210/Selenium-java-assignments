package com.PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(tagName="h3")
	private WebElement errorMsg;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		driver.get("https://www.saucedemo.com/");
	}
	
	public void checkTitle() {
		String s = driver.getTitle();
		Assert.assertEquals(s,"Swag Labs");
	}

	public void checkUsername() {
		Assert.assertTrue(usernameField.isDisplayed());
	}

	public void checkPassword() {
		Assert.assertTrue(passwordField.isDisplayed());		
	}

	public void enterUsername() {
		usernameField.sendKeys("standard_user");		
	}

	public void enterPassword() {
		passwordField.sendKeys("secret_sauce");
	}

	public void clickLoginButton() {
		loginButton.click();		
	}

	public void enterUsernamePassword() {
		usernameField.sendKeys("abc123");
		passwordField.sendKeys("pass123");
	}

	public void checkErrorMessage() {
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
							errorMsg.getText());
	}
}
