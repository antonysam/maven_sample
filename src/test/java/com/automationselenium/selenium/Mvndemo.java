/*
 * author Sam Dany Rajan
 */
package com.automationselenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mvndemo {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void test(String browser) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("hello");
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	public void validatetitle() {
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
