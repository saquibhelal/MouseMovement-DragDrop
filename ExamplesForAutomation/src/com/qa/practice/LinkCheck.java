package com.qa.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCheck {

	public static WebDriver driver;
	
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		        driver=new FirefoxDriver();
		      				
				driver.get("http://toolsqa.com/");	
				
				List<WebElement> link=driver.findElements(By.tagName("a"));
				System.out.println(link.size());
				for(int i=1;i<link.size();i++){
					String linkName=link.get(i).getText();
					
					System.out.println(linkName);
					if(linkName.equals("YouTube")){
						   link.get(i).click();
						
					    }
				}
				
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		/*
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		        driver=new FirefoxDriver();
		      				
				driver.get("http://toolsqa.com/");	
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		
		int count=img.size();
 
		System.out.println("-----------------\n"+links.size());
		
 
		for (int i = 1; i<=links.size(); i=i+1)
 
		{
 
			System.out.println(links.get(i).getText());
            
		}
		for(int i=1;i<count;i++){
			System.out.println(img.get(i).getText());
		}
 
	*/}
	
	}

