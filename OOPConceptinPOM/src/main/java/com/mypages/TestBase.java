package com.mypages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver driver;

	

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://uatreplica.enterodirect.com/login");		
		//driver.get("https://www.spicejet.com");
		//driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.moneycontrol.com/mutualfundindia/");
	}
	
	@AfterMethod
	public void teardown()
	{
		if(driver!=null) {
			//driver.quit();
		}
	}
	
	
}
