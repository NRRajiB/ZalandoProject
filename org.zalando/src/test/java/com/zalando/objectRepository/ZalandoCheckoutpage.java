package com.zalando.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zalando.Stepdefinition.Hook;
import com.zalando.resources.ZalandoBase;

public class ZalandoCheckoutpage extends ZalandoBase{
public ZalandoCheckoutpage() {
	PageFactory.initElements(Hook.driver, this);
}
@FindBy(name="login.email")
private WebElement email;
@FindBy(name="login.password")
private WebElement password;
@FindBy(xpath="(//font[text()='Log In'])[2]")
private WebElement login;
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
}
