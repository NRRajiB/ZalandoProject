package com.zalando.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zalando.Stepdefinition.Hook;
import com.zalando.resources.ZalandoBase;

public class ZalandoSRpage extends ZalandoBase {
public ZalandoSRpage() {
	PageFactory.initElements(Hook.driver,this);
}
@FindBy(xpath="(//div[@class='cat_infoCnt-3P_7F cat_text-26vYN'])[3]")
private WebElement prod1;
@FindBy(xpath="(//span[text()='Bitte Größe wählen'])[2]")
private WebElement size;
@FindBy(id="(//div[@class='h-col-12'])[5]")
private WebElement selctsz;
@FindBy(xpath="(//button[@type='button'])[13]")
private WebElement cart;
@FindBy(xpath="(//a[@class='z-navicat-header_navToolItemLink'])[1]")
private WebElement cartic;
@FindBy(xpath="(//div[@class='z-1-button__content'])[5]")
private WebElement checkout;
public WebElement getProd1() {
	return prod1;
}
public WebElement getSize() {
	return size;
}
public WebElement getSelctsz() {
	return selctsz;
}
public WebElement getCart() {
	return cart;
}
public WebElement getCartic() {
	return cartic;
}
public WebElement getCheckout() {
	return checkout;
}
}
