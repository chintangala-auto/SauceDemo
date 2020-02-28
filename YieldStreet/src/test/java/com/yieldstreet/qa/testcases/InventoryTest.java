package com.yieldstreet.qa.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yieldstreet.qa.base.TestBase;
import com.yieldstreet.qa.pages.Cart;
import com.yieldstreet.qa.pages.Inventory;
import com.yieldstreet.qa.pages.LoginPage;

import junit.framework.Assert;

public class InventoryTest extends TestBase{
	
	LoginPage loginPage;
	Inventory inventory;
	Cart cart;
	
	public InventoryTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		inventory = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test
	public void inventoryTitlePage() {
		String title = inventory.validateInventoryPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test
	public void addBlackTShirt() {
		WebElement shoppingCartBadge = inventory.addBlackTShirt();
		Assert.assertEquals(shoppingCartBadge, 1);
	}
	
	@Test
	public void addAllTShirt() {
		WebElement shoppingCartBadge = inventory.addAllTShirt();
		Assert.assertEquals(shoppingCartBadge, 2);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
