package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedtocheckout1;

	public Summary(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}
	
	

}
