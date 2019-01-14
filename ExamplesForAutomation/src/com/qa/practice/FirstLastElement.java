package com.qa.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLastElement {

	
	public static void main(String[] args) {
  
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.w3schools.com");
		
     WebElement element =driver.findElement(By.tagName("a"));
     
       
	}

}
