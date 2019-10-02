package com.cts.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskCbmrOne {
	public static WebDriver driver;
	@Given("launch the browser and open the url and click add customer")
	public void launch_the_browser_and_open_the_url_and_click_add_customer() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\org.task\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.findElement(By.xpath("(//a[text()=\"Add Customer\"])[1]")).click();
	}

	@When("the user navigates to home page and fill the text boxes and submit {string}, {string}, {string}, {string}, {string}")
	public void the_user_navigates_to_home_page_and_fill_the_text_boxes_and_submit(String s1, String s2, String s3, String s4, String s5) {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(s1);
	driver.findElement(By.id("lname")).sendKeys(s2);
	driver.findElement(By.id("email")).sendKeys(s3);
	driver.findElement(By.name("addr")).sendKeys(s4);
	driver.findElement(By.id("telephoneno")).sendKeys(s5);
	driver.findElement(By.name("submit")).click();
	}

	@Then("the user get the customer ID")
	public void the_user_get_the_customer_ID() {
	    List<WebElement> td = driver.findElements(By.tagName("td"));
for (WebElement data : td) {
	System.out.println(data.getText());		
		}
	}
	@When("the user navigates to home page and fill the text boxes and submit")
	public void the_user_navigates_to_home_page_and_fill_the_text_boxes_and_submit() {
	    System.out.println("Success");	}


}
