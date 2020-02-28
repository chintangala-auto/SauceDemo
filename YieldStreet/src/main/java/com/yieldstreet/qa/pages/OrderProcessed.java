package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class OrderProcessed extends TestBase{
	
	@FindBy(xpath="//h2[@class='complete-header']")
    WebElement orderConfirmationText;
	
	public OrderProcessed() {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmationText() {
		return orderConfirmationText.getText();
	}

}
