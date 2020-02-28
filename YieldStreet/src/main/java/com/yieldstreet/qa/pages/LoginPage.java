package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	// Page Factory or object reporisotory 
	@FindBy(xpath="//input[@id='user-name']")
    WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn_action']")
	WebElement loginBtn;
	
	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public Inventory login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new Inventory();
		}

}
