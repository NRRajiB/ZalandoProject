package com.cmbr.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo{
public pojo() {
	PageFactory.initElements(Hook.driver,this);
}
@FindBy(xpath="(//a[text()='Add Customer'])[1]")
private WebElement addbtn;
@FindBy(xpath="(//label[text()='Done'])[1]")
private WebElement click;
@FindBy(id="fname")
private WebElement firstname;
@FindBy(id="lname")
private WebElement lastname;
@FindBy(id="email")
private WebElement email;
@FindBy(name="addr")
private WebElement address;
@FindBy(id="telephoneno")
private WebElement phno;
@FindBy(name="submit")
private WebElement clk;

public WebElement getAddbtn() {
	return addbtn;
}
public WebElement getClick() {
	return click;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getAddress() {
	return address;
}
public WebElement getPhno() {
	return phno;
}
public WebElement getClk() {
	return clk;
}


}
