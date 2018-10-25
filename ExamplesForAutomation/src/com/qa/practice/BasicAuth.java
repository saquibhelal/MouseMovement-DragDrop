package com.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuth {

	public static void main(String[] args) {

		 WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop"
					+ "\\Selnium_Repos\\drivers\\chromedriver.exe");
			
			// Create a new instance of the FireFox driver
			driver = new ChromeDriver();
	 
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			String pageMessage=driver.findElement(By.cssSelector("p")).getText();
			System.out.println(pageMessage);
		
	}

}
