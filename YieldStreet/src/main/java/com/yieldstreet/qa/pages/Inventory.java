package com.yieldstreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yieldstreet.qa.base.TestBase;

public class Inventory extends TestBase{

	@FindBy(xpath="//div[@class='inventory_list']//div[1]//div[3]//button[1]")
    WebElement backpack;
	
	@FindBy(xpath="//div[3]//div[3]//div[1]")
    WebElement blackTShirt;
	
	@FindBy(xpath="//div[5]//div[3]//button[1]")
    WebElement onesie;
	
	@FindBy(xpath="//div[@class='inventory_container']//div[2]//div[3]//button[1]")
    WebElement bikeLight;
	
	@FindBy(xpath="//div[4]//div[3]//button[1]")
    WebElement fleece;
	
	@FindBy(xpath="//div[6]//div[3]//button[1]")
    WebElement redTShirt;
	
	@FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']")
    WebElement shoppingCart;
	
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
    WebElement shoppingCartBadge;
	
	public Inventory() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement addBlackTShirt() {
		blackTShirt.click();
		return shoppingCartBadge;
	}
	
	public WebElement addRedTShirt() {
		redTShirt.click();
		return shoppingCartBadge;
	}
	
	public WebElement addAllTShirt() {
		addBlackTShirt();
		addRedTShirt();
		return shoppingCartBadge;
	}

	public String validateInventoryPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	
}
