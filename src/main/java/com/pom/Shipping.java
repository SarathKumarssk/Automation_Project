package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkbox;

	@FindBy(xpath = "//button[@name='processCarrier']")
	public WebElement proceedshipping;

	public Shipping(WebDriver driver7) {
		this.driver = driver7;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceedshipping() {
		return proceedshipping;
	}


	}


