package com.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		// Create a new instance of the FireFox driver
					driver = new FirefoxDriver();
			 
					// Put an Implicit wait, 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
					// Launch the URL
					driver.get("https://www.amazon.in/");  
					
					Actions action= new Actions(driver);
					action.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"))).build().perform();
					Thread.sleep(3000);
					
		            driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span")).click();
		    
		
		
		
	}

}
