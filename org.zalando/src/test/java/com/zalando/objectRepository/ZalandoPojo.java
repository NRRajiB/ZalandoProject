package com.zalando.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zalando.Stepdefinition.Hook;
import com.zalando.resources.ZalandoBase;

public class ZalandoPojo extends ZalandoBase {
	public ZalandoPojo() {
	PageFactory.initElements(Hook.driver, this);	
	}
@FindBy(xpath="//input[@type='search']")
private WebElement search;
@FindBy(xpath="//div[@class='z-navicat-header_searchInputContainer z-navicat-header_searchInputContainer-expandedSearchVariant']")
private WebElement srcbtn;
public WebElement getSearch() {
	return search;
}
public WebElement getSrcbtn() {
	return srcbtn;

}
}
