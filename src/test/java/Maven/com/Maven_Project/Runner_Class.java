package Maven.com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Class {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarath\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']")).click();

		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		quantity.click();

		WebElement size = driver.findElement(By.xpath("//option[@value='3']"));
		size.click();

		WebElement add2cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		add2cart.click();

		Thread.sleep(3000);

		// Checkout
		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedtocheckout.click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		// Signin

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sarath321@mail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("00000");

		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		// Address
		WebElement proceedaddress = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceedaddress.click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Shipping
		WebElement proceedshipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		proceedshipping.click();

		// Payment
		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bankwire.click();

		// Order
		WebElement placeorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		placeorder.click();

		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Sarath\\eclipse-workspace\\SeleniumClass\\Screenshots\\MyStorePurchase.png");
		FileUtils.copyFile(source, destination);

	}
}
