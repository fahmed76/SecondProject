package com.qa.testNg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTwo {
	WebDriver driver;
	@Test
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	public void loginTotheApplication() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		
	}
	@Test
	public void validateLogin() {
		String actual = driver.findElement(By.xpath("//p[text()='Paul Collings']")).getText();
		String expected = "Paul Collings";
//		Assert.assertEquals(actual, expected, "Invalid credentials >> ");
		SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(actual, expected, "Invalid credentials >> ");
		driver.quit();
		softAssert.assertAll();
		
	}

}
