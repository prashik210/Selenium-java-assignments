package com.PageFactory.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement leftPaneMenu; 
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logouttext;
	
	@FindBy(className="title")
	private WebElement productsHeading;
	
	@FindBy(className="bm-cross-button")
	private WebElement sidebarCrossButton;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void checkLogin() {
		leftPaneMenu.click();
		//Assert.assertEquals("LOGOUT",logouttext.getText());
		//sidebarCrossButton.click();
	}

	public void checkHeadingValue() {
		Assert.assertEquals("PRODUCTS", productsHeading.getText());
	}
}
