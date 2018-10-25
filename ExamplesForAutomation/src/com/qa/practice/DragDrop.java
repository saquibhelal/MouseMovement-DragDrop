package com.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		// Create a new instance of the FireFox driver
		driver = new FirefoxDriver();
 
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']")))
	    .release().build().perform();
	    
		
		
		
	}

}
