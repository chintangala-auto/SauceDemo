package com.yieldstreet.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yieldstreet.qa.base.TestBase;
import com.yieldstreet.qa.pages.Cart;
import com.yieldstreet.qa.pages.Inventory;
import com.yieldstreet.qa.pages.LoginPage;
import com.yieldstreet.qa.pages.OrderProcessed;
import com.yieldstreet.qa.pages.Payment;
import com.yieldstreet.qa.pages.UserInformation;

public class OrderConfirmation extends TestBase{
	LoginPage loginPage;
	Inventory inventory;
	Cart cart;
	UserInformation userInformation;
	Payment payment;
	OrderProcessed orderProcessed;
	
	public OrderConfirmation() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventory = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventory.addAllTShirt();
		cart.checkout();
		userInformation = cart.checkout();
		orderProcessed = payment.confirmedOrder();
	}
	
	@Test
	public void confirmationText() {
		String actualMessage = orderProcessed.confirmationText();
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", actualMessage);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
