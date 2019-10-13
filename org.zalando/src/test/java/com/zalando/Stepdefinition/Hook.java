package com.zalando.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ammu\\eclipse-workspace\\org.zalando\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	}
	@After
	public void Quit() {
		System.out.println("Success");
	}
}
