package com.yieldstreet.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yieldstreet.qa.util.TestUtil;

// We create base class so for page we don't have to define chromedriver
public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	// Read the properties
	public TestBase() {
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/cgala/eclipse-workspace/YieldStreet/src/main/java/com/yieldstreet/"
					+"/qa/config/confog.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	// For FireFox we can use Gecko Driver
	// Reading time outs from test util class
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/cgala/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
				
	}
	
	
}
