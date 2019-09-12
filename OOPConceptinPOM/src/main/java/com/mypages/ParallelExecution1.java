package com.mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParallelExecution1 extends TestBase{	
	
	

	@Test
	public void First() throws InterruptedException {
		
		//driver.findElement(By.name("email")).sendKeys("jpn");
		
		String title=driver.getTitle();
		System.out.println("Home Page Title is " + title);
		System.out.println("First Test Case");
		
		Select Currency =new Select(driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency']")));
		List<WebElement> getCurrencylist=Currency.getOptions();
		for(WebElement Cur: getCurrencylist){
			System.out.println(Cur.getText());
		}
		Currency.selectByIndex(2);
		Currency.selectByValue("INR");
		Currency.selectByVisibleText("AED");
		
//--------------------------------------------------------------------------------------------
		
//		Select from =new Select(driver.findElement(By.xpath("//*[@name='ctl00$mainContent$ddl_originStation1']")));
//		from.selectByValue("Chennai (MAA)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='ctl00$mainContent$ddl_originStation1']/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mumbai')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Chennai')])[2]")).click();
		
		
	}
	
//	@Test
//	public void Second() {
//		driver.findElement(By.name("password")).sendKeys("1234");
//		System.out.println("Second Test Case");
//	}
//	
//	@Test
//	public void Third() {
//		System.out.println("Third Test Case");
//	}

}
