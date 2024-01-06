package com.smart.parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParameters {
	
	@Test
	@Parameters("google")
	public void testGoogle(@Optional("chrome")String browser) {
		WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Chrome browser is launched");
		driver.quit();
	}

	@Test
	@Parameters ("facebook")
	public void testFacebook(@Optional("chrome")String browser) {
		WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Facebook browser is launched");
		driver.quit();
	}
		
	@Test
	@Parameters ("orangeHRM")
	public void testOrangeHRM(@Optional("chrome")String browser) {
			WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("OrangeHRM browser is launched");
			driver.quit();	
		}

}
