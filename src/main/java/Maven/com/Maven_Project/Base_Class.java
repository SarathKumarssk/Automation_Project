package Maven.com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void Thread() throws InterruptedException {
		Thread.sleep(2000);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void selectbyindex (WebElement size,int two) {

		Select s = new Select(size);
		s.selectByIndex(two);
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}
	
	
	public static void scrollDown (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		

	}

	public static void screenshot() throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Sarath\\eclipse-workspace\\SeleniumClass\\Screenshots\\Runner_POM.png");
		FileUtils.copyFile(source, destination);

	}
}
