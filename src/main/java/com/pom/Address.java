package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
	@FindBy(xpath ="//button[@name='processAddress']")
	public WebElement proceedaddress;

	public Address(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedaddress() {
		return proceedaddress;
	}
	
	

}
