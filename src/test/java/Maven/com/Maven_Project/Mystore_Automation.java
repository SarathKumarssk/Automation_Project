package Maven.com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Mystore_Automation extends Base_Class  {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getBrowser("chrome");

		geturl("http://automationpractice.com/");

		maximize();
		Thread();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signin);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		inputValueElement(email, "sarath321@mail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		inputValueElement(password, "00000");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(submit);
		
		WebElement clickdress = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickOnElement(clickdress);

		WebElement clickimage = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		clickOnElement(clickimage);

		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickOnElement(quantity);

		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		selectbyindex(size, 2);

		WebElement add2cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(add2cart);

		Thread();

		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(proceedtocheckout);

		WebElement proceedtocheckout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(proceedtocheckout1);
		
		WebElement proceedaddress = driver.findElement(By.xpath("//button[@name='processAddress']"));
		clickOnElement(proceedaddress);

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(checkbox);

		WebElement proceedshipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOnElement(proceedshipping);

		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(bankwire);

		WebElement placeorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(placeorder);

	    screenshot();

}
}



