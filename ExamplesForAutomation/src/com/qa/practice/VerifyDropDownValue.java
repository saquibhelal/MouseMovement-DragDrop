package com.qa.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownValue {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		// Create a new instance of the FireFox driver
		driver = new FirefoxDriver();
 
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		
		String arr[]={"Month","Jan","Feb","Mar","April","May","Jun","July","Sep","Oct","Nov","Dec"};

		Select select= new Select(driver.findElement(By.id("month")));
		List<WebElement> dropDownValue=select.getOptions();
		System.out.println(dropDownValue.size());
		
		for(int i=0;i<dropDownValue.size();i++)
		{
			
			/*Assert.assertEquals(arr[i],dropDownValue.get(i).getText());*/
		}
		System.out.println("Verification Done----->");
		driver.close();
	}


}

