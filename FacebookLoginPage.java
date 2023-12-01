package com.Facebook.qa.Page;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
	
	@Test
	public void testFacebookPage() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title =driver.getTitle();
		
		System.out.println("The title of this page is :" + title);
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.clear();
		
		username.sendKeys("admin@admin.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.clear();
		
		password.sendKeys("admin");
		
		WebElement searchbtn = driver.findElement(By.name("login"));
		
		searchbtn.submit();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		assertFalse(driver.getCurrentUrl().contains("https://www.facebook.com/home"),"Facebook Authentication Failed");
		
		//driver.close();
		
	}

}
