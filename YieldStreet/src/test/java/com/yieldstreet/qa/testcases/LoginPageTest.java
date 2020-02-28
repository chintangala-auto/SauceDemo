package com.yieldstreet.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yieldstreet.qa.base.TestBase;
import com.yieldstreet.qa.pages.Inventory;
import com.yieldstreet.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	Inventory inventory;
	
	public LoginPageTest() {
		super(); // will call test base constructor
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage = new LoginPage();
		
	}
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test(priority=1)
	public void loginTest() {
		inventory = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
