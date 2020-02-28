package com.yieldstreet.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yieldstreet.qa.base.TestBase;
import com.yieldstreet.qa.pages.Cart;
import com.yieldstreet.qa.pages.Inventory;
import com.yieldstreet.qa.pages.LoginPage;
import com.yieldstreet.qa.pages.Payment;
import com.yieldstreet.qa.pages.UserInformation;

public class UserInformationTest extends TestBase{
	
	LoginPage loginPage;
	Inventory inventory;
	Cart cart;
	UserInformation userInformation;
	Payment payment;
	
	public UserInformationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventory = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		inventory.addAllTShirt();
		cart.checkout();
		
	}
	
	@Test
	public void userInfoTest() {
		payment = userInformation.userInfo(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("zipCode"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
