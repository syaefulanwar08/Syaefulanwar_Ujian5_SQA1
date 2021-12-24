package locator.pages.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locator.driver.DriverSingleton;

public class Checkout {
	private WebDriver driver;
	
	public Checkout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "button_order_cart")
	private WebElement btnCheckout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement btnProcessCheckout;
	
	@FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
	private WebElement txtCommandOrder;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement btnProcessedToCheckoutAddress;
	
	@FindBy(id = "cgv")
	private WebElement checkboxShipping;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement btnProcessedToCheckoutShipping;
	
	public void gotoCheckout() {
		btnCheckout.click();
	}
	
	public void gotoProcessCheckout() {
		btnProcessCheckout.click();
	}
	
	public void commandOrder(String write) {
		txtCommandOrder.sendKeys(write);
	}
	
	public void gotoProcessShipping() {
		btnProcessedToCheckoutAddress.click();
	}
	
	public void CheckboxShipping() {
		checkboxShipping.click();
	}
	
	public void gotoProcessPayment() {
		btnProcessedToCheckoutShipping.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	}
}
