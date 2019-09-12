package com.mypages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalendarTest extends TestBase {
	
	@Test
	public void Calendar() {
		
		driver.findElement(By.name("travel_date")).click();
		String Month=driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]")).getText();
		System.out.println("Name of the Month is " + Month);
		while(!Month.contains("August")) {
			driver.findElement(By.xpath("(//*[@class='next'])[1]")).click();
			
		}
	}

}
