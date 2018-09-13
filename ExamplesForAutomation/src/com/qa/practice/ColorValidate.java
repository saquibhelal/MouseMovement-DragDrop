package com.qa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorValidate {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.w3schools.com");
        String Color = driver.findElement(By.xpath("html/body/div[7]/div[1]/div[2]/div/a")).getCssValue("color");
        System.out.println(Color);
        String hex = String.format("#%02x%02x%02x", 102,102,102);
        System.out.println(hex);
	}

}
