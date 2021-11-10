package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add2Cart {

	public WebDriver driver;

	@FindBy(xpath = "//img[@class='replace-2x img-responsive']")
	private WebElement clickimage;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement add2cart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;

	public Add2Cart(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickimage() {
		return clickimage;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAdd2cart() {
		return add2cart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

}
