package com.cmbr.stepdefinition;

import org.openqa.selenium.WebElement;

public class demoBase {
public  void url(String url) {
	Hook.driver.get(url);
	Hook.driver.manage().window().maximize();
}
public void type(WebElement ele, String name) {
	ele.sendKeys(name);
}
public void btn(WebElement ele) {
	ele.click();
}
}
