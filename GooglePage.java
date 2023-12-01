package com.Google.qa.Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {
	
	@Test
	public void testSearchengine() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		System.out.println("The title of this page is :" + title);
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		
		Thread.sleep(2000);
		
		search.sendKeys("Facebook");
		
		Thread.sleep(2000);
		
		search.submit();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		assertTrue(driver.getCurrentUrl().contains("Facebook"),"Google Search is Successful");
		
		driver.close();
		}
	}