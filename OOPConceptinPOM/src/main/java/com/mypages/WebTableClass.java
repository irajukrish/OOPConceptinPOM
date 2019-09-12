package com.mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableClass  extends TestBase {
	
	@Test
	public void Webtable() {
		
		//List<WebElement> Mutualfundtable=driver.findElements(By.xpath("(//table[@class='mctable1'])[1]"));
		List<WebElement> MFtable=driver.findElements(By.xpath("//table[@class='mctable1']/tbody"));
//		for(WebElement mf: MFtable) {
//			System.out.println("Size of Table Rows are " + mf.findElement(By.tagName("tr")).getSize());
//			System.out.println(mf.findElement(By.tagName("tr")).getText());
//			System.out.println("Size of Table Columns are " + mf.findElement(By.tagName("td")).getSize());
//			System.out.println(mf.findElement(By.tagName("td")).getText());
//		}
		
		int mft=driver.findElements(By.xpath("//table[@class='mctable1']/tbody")).size();
		
		for(int i=0; i<=mft;i++) {
			
			System.out.println("Size of Table Rows are " + MFtable.get(i).findElement(By.tagName("tr")).getSize());
			System.out.println(MFtable.get(i).findElement(By.tagName("tr")).getText());
			System.out.println("Size of Table Columns are " + MFtable.get(i).findElement(By.tagName("td")).getSize());
			System.out.println(MFtable.get(i).findElement(By.tagName("td")).getText());
			if(i>5)
				break;
			
		}
		
		
	}

}
