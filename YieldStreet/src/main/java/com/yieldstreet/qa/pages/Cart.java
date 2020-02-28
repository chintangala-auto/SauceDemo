package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class Cart extends TestBase{
	
	@FindBy(xpath="//a[@class='btn_secondary']")
    WebElement continueShopping;

	@FindBy(xpath="//a[@class='btn_action checkout_button']")
    WebElement checkout;
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	
	public UserInformation checkout() {
        checkout.click();
		return new UserInformation();
	}

}
