package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		    WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop"
					+ "\\Selnium_Repos\\drivers\\chromedriver.exe");
			
			// Create a new instance of the FireFox driver
			driver = new ChromeDriver();
			driver.get("https://html.com/input-type-file/");
			/*Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			String text=alert.getText();*/
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Desktop\\Fees Management.docx");

	}

}
