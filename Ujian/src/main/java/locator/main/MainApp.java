package locator.main;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import locator.driver.DriverSingleton;
import locator.pages.addToChart.AddToChart;
import locator.pages.checkout.Checkout;
import locator.pages.register.Register;



public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverSingleton.getInstance().getDriver(); 
		driver.get("http://automationpractice.com/index.php");
		
		MainApp main = new MainApp();
		main.register();
		main.addToChart();
		main.checkout();
		
	}
	
	public void register() {
		
		WebDriver driver = DriverSingleton.getInstance().getDriver(); 
		driver.get("http://automationpractice.com/index.php");
		
		Register register = new Register();
		register.gotoSignin();
		register.inputEmail("Jones3@gmail.com"); // kalo error tinggal ganti input emailnya
		register.inputGender(1);
		register.inputFirstname("paul");
		register.inputLastname("jones");
		register.inputPassword("pauljones");
		register.inputDateofBirth("17", "8", "1987");
		register.inputNewsletter();
		register.inputOptin();
		register.inputFirstnameAddress("paul");
		register.inputLastnameAddress("jones");
		register.inputCompany("PT.Sejahtera");
		register.inputAddress1("Bandung");
		register.inputAddress2("Jakarta");
		register.inputCity("Bandung");
		register.inputState("32");
		register.inputPostcode("32124");
		register.inputCountry("21");
		register.inputAdditionalInfo("yes");
		register.inputPhoneHome("02298865418");
		register.inputPhoneMobile("08976642468");
		register.inputAlias("bandung");
		register.inputSubmitAccount();
	}
	
	public void addToChart() {
		
		AddToChart add = new AddToChart();
		add.gotoDress();
		add.addToChartDress();
		add.closeModalDress();
		add.hoverChartDress();
		add.gotoTshirt();
		add.addToChartTshirt();
		add.closeModalTshirt();
		add.hoverChartTshirt();
		
	}
	
	public void checkout() {
		
		Checkout checkout = new Checkout();
		checkout.gotoCheckout();
		checkout.gotoProcessCheckout();
		checkout.commandOrder("if there is red color, I want to choose red color");
		checkout.gotoProcessShipping();
		checkout.CheckboxShipping();
		checkout.gotoProcessPayment();
	}


}
