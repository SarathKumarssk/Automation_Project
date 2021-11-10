package Maven.com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pom.Add2Cart;
import com.pom.Address;
import com.pom.Login_Page;
import com.pom.MyStore_HomePage;
import com.pom.Payment;
import com.pom.Shipping;
import com.pom.Store;
import com.pom.Summary;

public class Runner_POM extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static MyStore_HomePage hp = new MyStore_HomePage(driver);
	public static Login_Page login = new Login_Page(driver);
	public static Store dress = new Store(driver);
	public static Add2Cart cart = new Add2Cart(driver);
	public static Summary sum = new Summary(driver);
	public static Address add = new Address(driver);
	public static Shipping ship = new Shipping(driver);
	public static Payment pay = new Payment(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		geturl("http://automationpractice.com/");

		maximize();
		Thread();

		clickOnElement(hp.getSignin_Btn());
		inputValueElement(login.getEmail(), "sarath321@mail.com");
		inputValueElement(login.getPassword(), "00000");
		clickOnElement(login.getSubmit());
		Thread();
		clickOnElement(dress.getStore());
		clickOnElement(cart.getClickimage());
		clickOnElement(cart.getQuantity());
		selectbyindex(cart.getSize(), 2);
		clickOnElement(cart.getAdd2cart());
		Thread();
		clickOnElement(cart.getProceedtocheckout());
		clickOnElement(sum.getProceedtocheckout1());
		clickOnElement(add.getProceedaddress());
		clickOnElement(ship.getCheckbox());
		clickOnElement(ship.getProceedshipping());
		clickOnElement(pay.getBankwire());
		clickOnElement(pay.getPlaceorder());
		screenshot();

	}

}
