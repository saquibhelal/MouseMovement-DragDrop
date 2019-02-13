package com.qa.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableByNaveen {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/"); // enter URL
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rehan007");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rehan007");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		// Method 1-------
		
		/*String total_row="//*[@id='vContactsForm']/table/tbody/tr[1]/td/table/tbody";
		int count=total_row.length();
		System.out.println(count);
		String befor_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/input";
		
		for(int row=4; row<=count; row++){
			String name=driver.findElement(By.xpath(befor_xpath+row+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Selenium Jenkins")){
				//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+row+"]/td[2]/input")).click();
			}
		}
		*/
		// Method 2----
		
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Jenkins')]//parent::td/preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Test Selenium')]//parent::td/preceding-sibling::td//input[@name='contact_id']")).click();

	}
	
	
	

}
