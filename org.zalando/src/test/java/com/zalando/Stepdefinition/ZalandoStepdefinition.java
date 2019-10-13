package com.zalando.Stepdefinition;

import com.zalando.objectRepository.ZalandoCheckoutpage;
import com.zalando.objectRepository.ZalandoPojo;
import com.zalando.objectRepository.ZalandoSRpage;
import com.zalando.resources.ZalandoBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZalandoStepdefinition extends ZalandoBase{
	ZalandoPojo zp=new ZalandoPojo();
	ZalandoSRpage sp=new ZalandoSRpage();
	ZalandoCheckoutpage cp=new ZalandoCheckoutpage();
	
	@Given("open the url and click login button")
	public void open_the_url_and_click_login_button() {
	    Url("https://www.zalando.de/herren-home/");
	}

	
	@When("search the product from excel")
	public void search_the_product_from_excel() throws Exception {	
	type(zp.getSearch(),excelvalue().get(1).get("Product"));
	keyfun();
	btn(sp.getProd1());
	Thread.sleep(1000);
	actionpfm(sp.getSize());
	Thread.sleep(2000);
	btn(sp.getCart());
	btn(sp.getCartic());
	btn(sp.getCheckout());
	type(cp.getEmail(),excelvalue().get(1).get("Email"));
	type(cp.getPassword(),excelvalue().get(1).get("password"));
	btn(cp.getLogin());
	}

	@Then("check the product rate")
	public void check_the_product_rate() {
	   System.out.println("Done");
	}



}
