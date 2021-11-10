package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	public WebElement store;

	public Store(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getStore() {
		return store;
	}

}
