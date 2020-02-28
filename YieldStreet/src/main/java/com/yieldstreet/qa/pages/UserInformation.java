package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class UserInformation extends TestBase{
	
	@FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstName;

	@FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastName;

	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
    WebElement zipCode;
	
	@FindBy(xpath="//input[@class='btn_primary cart_button']")
    WebElement continuePayment;
	
	@FindBy(xpath="//a[@class='cart_cancel_link btn_secondary']")
    WebElement cancel;
	
	public UserInformation() {
		PageFactory.initElements(driver, this);
	}

	public Payment userInfo(String fName, String lName, String zCode) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		zipCode.sendKeys(zCode);
		
		return new Payment();
	}
	

}
