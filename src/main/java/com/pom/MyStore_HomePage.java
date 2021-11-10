package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStore_HomePage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin_Btn;

	public MyStore_HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

}
