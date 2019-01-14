package com.qa.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop"
					+ "\\Selnium_Repos\\drivers\\chromedriver.exe");
			
			// Create a new instance of the FireFox driver
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(3000);
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			String text=alert.getText();
			
			if(text.equals("Please enter a valid user name")){
				alert.accept();
				System.out.println("correct alert message");
				
			}else{
				alert.dismiss();
				System.out.println("Not correct alert message");
				
			}
			//alert.accept();
			//alert.dismiss();
			
	}

}
