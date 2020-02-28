package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class Payment extends TestBase{

	@FindBy(xpath="//input[@id='user-name']")
    WebElement finish;

	@FindBy(xpath="//input[@id='user-name']")
    WebElement cancel;
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderProcessed confirmedOrder() {
		finish.click();
		return new OrderProcessed();
	}

}
