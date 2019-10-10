package com.cmbr.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CmbrDatatable {
	static WebDriver driver;
	
	@Given("launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\org.task\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}	
	@Given("open the url")
	public void open_the_url() {
		driver.get("http://demo.guru99.com/telecom/index.html");    
		driver.getTitle();
	}

	@Given("click add customer")
	public void click_add_customer() {
		driver.findElement(By.xpath("(//a[text()=\"Add Customer\"])[1]")).click();
	}



	@When("the user navigates to home page and fill the text boxes and submit")
	public void the_user_navigates_to_home_page_and_fill_the_text_boxes_and_submit(io.cucumber.datatable.DataTable dataTable) throws Exception {
	    Map<String, String> mp = dataTable.asMap(String.class,String.class);
	    			    driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
	    		    driver.findElement(By.id("fname")).sendKeys(mp.get("FirstName"));
	    			driver.findElement(By.id("lname")).sendKeys(mp.get("LastName"));
	    			driver.findElement(By.id("email")).sendKeys(mp.get("Email"));
	    			driver.findElement(By.name("addr")).sendKeys(mp.get("Address"));
	    			driver.findElement(By.id("telephoneno")).sendKeys(mp.get("Mob number"));
	    			driver.findElement(By.name("submit")).click();
	    			List<WebElement> td = driver.findElements(By.tagName("td"));
	    			for (WebElement data : td) {
	    				System.out.println(data.getText());	}			
	    }					
		

	@Then("the user get the customer ID")

	public void the_user_get_the_customer_ID() {
		driver.close();
		System.out.println("Done");	
	}
	}
