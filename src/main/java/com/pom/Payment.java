package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	public WebElement bankwire;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement placeorder;

	public Payment(WebDriver driver8) {
		this.driver=driver8;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}
	
	

}
