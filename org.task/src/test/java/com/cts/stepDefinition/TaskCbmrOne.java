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

	@When("the user navigates to home page and fill the text boxes and submit")
	public void the_user_navigates_to_home_page_and_fill_the_text_boxes_and_submit(io.cucumber.datatable.DataTable dataTable) {
		List<String> A = dataTable.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(A.get(0));
		driver.findElement(By.id("lname")).sendKeys(A.get(1));
		driver.findElement(By.id("email")).sendKeys(A.get(2));
		driver.findElement(By.name("addr")).sendKeys(A.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(A.get(4));
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user get the customer ID")
	public void the_user_get_the_customer_ID() {
		List<WebElement> td = driver.findElements(By.tagName("td"));
		for (WebElement data : td) {
			System.out.println(data.getText());		
				}
	}


}
