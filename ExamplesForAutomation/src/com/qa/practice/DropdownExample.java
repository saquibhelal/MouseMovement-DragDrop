package com.qa.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		
			// Create a new instance of the FireFox driver
			driver = new FirefoxDriver();
	 
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
			// Launch the URL
			driver.get("https://www.facebook.com/");
			
			Select select=new Select(driver.findElement(By.id("month")));
			// select option by visible text....
			select.selectByVisibleText("Aug");
	 
			Thread.sleep(2000);
			
			select.selectByIndex(11);
			
			Thread.sleep(2000);
			
			select.selectByValue("8");
			Thread.sleep(2000);

			// print all option from drop down and chose any one of your choice.....
			
			List<WebElement> oSize=select.getOptions();
			int count=oSize.size();
			
			// iterate loop to get all value 
			
			for(int i=1; i<count;i++)
			{
			  String allValue	=select.getOptions().get(i).getText();
			 //System.out.println("Drop down value are====>>>>>"+allValue);
				  
			  if(allValue.equals(""))
			  select.selectByIndex(i);
			  else
				  System.out.println("Not found=====>>>");
			  
			  
			     driver.close();
			}			
			

	
	}

	
	
	
	
}
	
