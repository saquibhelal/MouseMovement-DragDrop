package com.qa.practice;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartExample {
	
	public static long PAGE_LOAD_TIMEOUT= 25;
	public static long IMPLICIT_WAIT= 20;
	

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
	
    
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	        driver=new FirefoxDriver();
 
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//Login to flipkart
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		//Select any mobile
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung")));
		// Select samsung phone
		element1.click();
		
		// select particular mobile
		String parent=driver.getWindowHandle();
		System.out.println("This is parents window"+parent);// 
		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[3]/div/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div/div/a")).click();
		
		//Swich to another tab code.
		Set <String> allWindows=driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("Total Window"+count);
		for(String child:allWindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				
				WebDriverWait wait1 = new WebDriverWait(driver, 10);
				WebElement element2 = wait1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
				
				element2.click();
				
				//Add item to cart
				//driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
				
				//Continue shopping
				driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[1]/div/div[3]/div/div/a/button")).click();
				
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parents window title is :"+driver.getTitle());

	
		//driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
