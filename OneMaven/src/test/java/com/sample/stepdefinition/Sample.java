
package com.sample.stepdefinition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample{
	static WebDriver driver=Hook.driver;
	@Given("open the url and click add customer")
	public static void open_the_url_and_click_add_customer() {
		driver.get("http://demo.guru99.com/telecom/index.html");
	 System.out.println("launched"); 
	 driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
	}

	@When("the user navigates to home page and fill the text boxes and submit")
	public void the_user_navigates_to_home_page_and_fill_the_text_boxes_and_submit(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {	
		List<String> l = dataTable.asList(String.class);
	 for (int i = 0; i < l.size(); i++) {
		 		 driver.findElement(By.xpath("(//label[text()=\"Done\"])[1]")).click();
		 		 Thread.sleep(20000);
		 driver.findElement(By.id("fname")).sendKeys(l.get(0));	
		 driver.findElement(By.id("lname")).sendKeys(l.get(1));
		 driver.findElement(By.id("email")).sendKeys(l.get(2));
		 driver.findElement(By.id("message")).sendKeys(l.get(3));
		 driver.findElement(By.id("telephoneno")).sendKeys(l.get(4));
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(10000);
		} 
	}

	@Then("the user get the customer ID")
	public void the_user_get_the_customer_ID() {
	    System.out.println("Done");
	}

}	
		
		
	
