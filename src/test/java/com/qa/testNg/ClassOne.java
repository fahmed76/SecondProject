package com.qa.testNg;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {
	
	@Test
	public void googleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("proSmart", Keys.ENTER);
		String actualTitle = driver.getTitle();
		String expectedTitle = "proSmart - Google Search";
		
//		Assert.assertEquals(actualTitle, expectedTitle);
		
		assertEquals(actualTitle, expectedTitle, "Title did not match");
		driver.quit();
	}
	
	@Test
	public void facebookTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("proSmart", Keys.ENTER);
		driver.findElement(By.name("login")).click();
		String tittle = driver.getTitle();
		System.out.println(tittle);
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
