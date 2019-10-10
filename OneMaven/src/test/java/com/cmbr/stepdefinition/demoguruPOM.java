package com.cmbr.stepdefinition;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoguruPOM extends demoBase{
	pojo pj=new pojo();
	@Given("the user opens the url and open login page and click add customer")
	public void the_user_opens_the_url_and_open_login_page_and_click_add_customer() {
	 url("http://demo.guru99.com/telecom/index.html"); 
	 btn(pj.getAddbtn());
	}

	@When("the user fills the text box in home page")
	public void the_user_fills_the_text_box_in_home_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(20000);
		List<String> li = dataTable.asList(String.class);
		
	    btn(pj.getClick());	
	    	type(pj.getFirstname(),li.get(0));	
	    	type(pj.getLastname(),li.get(1));
	    	type(pj.getEmail(),li.get(2));
	    	type(pj.getAddress(),li.get(3));
	    	type(pj.getPhno(),li.get(4));
	    	btn(pj.getClk());
	}

	@Then("customer Id is generated and printed")
	public void customer_Id_is_generated_and_printed() {
	   System.out.println("Done");
	}


}
