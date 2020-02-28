package com.yieldstreet.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.yieldstreet.qa.base.TestBase;
import com.yieldstreet.qa.pages.Cart;
import com.yieldstreet.qa.pages.Inventory;
import com.yieldstreet.qa.pages.LoginPage;
import com.yieldstreet.qa.pages.Payment;
import com.yieldstreet.qa.pages.UserInformation;

public class CartTest extends TestBase{
	
	LoginPage loginPage;
	Inventory inventory;
	Cart cart;
	UserInformation userInformation;
	
	public CartTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventory = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventory.addAllTShirt();
	}
	
	public void checkout() {
		userInformation = cart.checkout();	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
