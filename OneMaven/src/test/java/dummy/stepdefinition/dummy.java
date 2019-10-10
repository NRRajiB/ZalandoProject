package dummy.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sample.stepdefinition.Hook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dummy {
	static WebDriver driver=Hook1.driver;
	@Given("Launch the browser and open the url")
	public void launch_the_browser_and_open_the_url() {
		    driver.get("https://adactin.com/HotelApp/");

	}

	@When("Enter the username, password and click")
	public void enter_the_username_password_and_click(io.cucumber.datatable.DataTable dataTable) {
	    List<String> l = dataTable.asList(String.class);
	    driver.findElement(By.id("username")).sendKeys(l.get(0));
	    driver.findElement(By.id("password")).sendKeys(l.get(1));
	    driver.findElement(By.id("login")).click();
	}

	@Then("Navigate to home page")
	public void navigate_to_home_page() {
	 System.out.println("Success");  
	}

	@When("Enter the username, password and click {string},{string}")
	public void enter_the_username_password_and_click(String s1, String s2) {
		driver.findElement(By.id("username")).sendKeys(s1);
	    driver.findElement(By.id("password")).sendKeys(s2);
	    driver.findElement(By.id("login")).click();
	}	
}
