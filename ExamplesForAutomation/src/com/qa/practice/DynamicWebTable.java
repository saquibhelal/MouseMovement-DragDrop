package com.qa.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
        WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		
			// Create a new instance of the FireFox driver
			driver = new FirefoxDriver();
	 
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
			// Launch the URL
			driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
			WebElement baseTable = driver.findElement(By.tagName("table"));
			
			//No of columns
			List <WebElement>col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
			System.out.println("No of cols are :" +col.size());
			
			//No of rows
			List <WebElement> rows= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
			System.out.println("No of rows are :" +rows.size());
			
			//To find third row of table
			WebElement tableRow= baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[6]"));
			//String rowText= tableRow.getText();
			System.out.println("Sixth row of a table :" +tableRow.getText());
			//To get 6th row and 4th col
			WebElement cellneed=tableRow.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[6]/td[2]"));
			System.out.println("Value of 6th row and 4th cell are :" +cellneed.getText());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//*[@id='leftcontainer']/table/thead/tr/th[1]/text()
	}

}
