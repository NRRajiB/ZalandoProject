package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngCode {
	@Parameters({"firstName", "lastName", "address", "email", "phno", "pwrd", "Cpwrd"})
	@Test
	private void test1(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\TestNGCode\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstname.sendKeys(s1);
	WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	lastname.sendKeys(s2);
	WebElement adrs = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	adrs.sendKeys(s3);
	WebElement eml = driver.findElement(By.xpath("//input[@type='email']"));
	eml.sendKeys(s4);
	WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
	ph.sendKeys(s5);
	WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		female.click();
		WebElement chbox = driver.findElement(By.id("checkbox2"));
		chbox.click();
		WebElement sct = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
		Select selct=new Select(sct);
		selct.selectByVisibleText("Australia");
		WebElement yr = driver.findElement(By.id("yearbox"));
		Select syr=new Select(yr);
		syr.selectByValue("1994");
		WebElement mnth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select smnth=new Select(mnth);
		smnth.selectByVisibleText("December");
		WebElement day = driver.findElement(By.id("daybox"));
		Select sday=new Select(day);
		sday.selectByValue("27");
		WebElement pwrd = driver.findElement(By.id("firstpassword"));
		pwrd.sendKeys(s6);
		WebElement cpwrd = driver.findElement(By.id("secondpassword"));
cpwrd.sendKeys(s7);
		
WebElement submit = driver.findElement(By.id("submitbtn"));
submit.click();
	}
}
