package com.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFieldValidation {

    static WebDriver driver;
	public static void main(String[] args) throws Exception {
	    String[] invalidChars = {"#", "!", "$", "@", "%", "^", "&"};
	    String name = "acbcdefghijklmnopqrstuvwxyzab";
	    
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\"
				+ "chromedriver.exe");
		
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://www.vrlbus.in/vrl2013/register_customer.aspx");
	    for (String invalid : invalidChars) {
	    	//driver.findElement(By.id("FIRSTNAME")).clear();
	    	driver.findElement(By.id("FIRSTNAME")).sendKeys(name + invalid);
	    	driver.findElement(By.xpath("//*[@id='Button1']")).click();
	        String alertMessage = driver.switchTo().alert().getText();
	        System.out.println(invalid);
	        if (alertMessage.equals("First name Should not contain Special Characters")) {
	            System.out.println("Error displayed: First name Should not contain Special Characters");
	            driver.switchTo().alert().dismiss();
	        } else {
	            System.out.println("Accepted");
	        }
	    }
	    driver.findElement(By.id("FIRSTNAME")).sendKeys("acbcdefghijklmnopqrstuvwxyzabcdef");
	    driver.findElement(By.xpath("//*[@id='Button1']")).click();
	    String alertMessage = driver.switchTo().alert().getText();
	    if (alertMessage.equals("First name Should not contain Special Characters")) {
	        System.out.println("Error displayed: First name Should not contain Special Characters");
	        driver.switchTo().alert().dismiss();
	    } else {
	        System.out.println("Accepted");
	    }
	   // driver.quit();
	}
	
	
}
