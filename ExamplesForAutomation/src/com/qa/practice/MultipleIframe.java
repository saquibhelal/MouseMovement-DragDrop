package com.qa.practice;

import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop"
				+ "\\Selnium_Repos\\drivers\\chromedriver.exe");
		
		// Create a new instance of the FireFox driver
		driver = new ChromeDriver();//navigates to the Browser
	    driver.get("http://toolsqa.wpengine.com/iframe-practice-page/"); 
	       // navigates to the page consisting an iframe
           
	       driver.manage().window().maximize();
	      // List<WebElement> elements=driver.findElements(By.tagName("iframe"));
	      // int noFrame=elements.size();
	      int count= driver.findElements(By.xpath("//iframe")).size();
	       System.out.println(count);
	       for(int i=0;i<count;i++);
	       
	       
	       /*if(driver.getPageSource().contains("login")){
	    	   
	    	   driver.findElement(By.id("username")).sendKeys("Rehan007");
		       driver.findElement(By.id("password")).sendKeys("rehan007");
		       driver.findElement(By.name("login")).click();
	       }*/
	    	   
	       
	      

	}
	
    
    	   
     
}
