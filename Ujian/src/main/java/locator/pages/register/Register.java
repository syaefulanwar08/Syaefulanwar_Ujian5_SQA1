package locator.pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.driver.DriverSingleton;

public class Register {

	private WebDriver driver;
	
	public Register() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement menuSignin;
	
	@FindBy(id = "email_create")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private WebElement txtGenderMr;
	
	@FindBy(id = "//*[@id=\"id_gender2\"]")
	private WebElement txtGenderMrs;
	
	@FindBy(id = "customer_firstname")
	private WebElement txtFirstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement txtLastname;
	
	@FindBy(id = "email")
	private WebElement txtEmailUser;
	
	@FindBy(id = "passwd")
	private WebElement txtPassword;
	
	@FindBy(id = "newsletter")
	private WebElement txtNewsletter;
	
	@FindBy(id = "optin")
	private WebElement txtOptin;
	
	
	///// YOUR ADDRESS
	
	@FindBy(id = "firstname")
	private WebElement txtFirstnameAddress;
	
	@FindBy(id = "lastname")
	private WebElement txtLastnameAddress;
	
	@FindBy(id = "company")
	private WebElement txtCompany;
	
	@FindBy(id = "address1")
	private WebElement txtAddress1;
	
	@FindBy(id = "address2")
	private WebElement txtAddress2;
	
	@FindBy(id = "city")
	private WebElement txtCity;
	
	@FindBy(id = "postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "other")
	private WebElement txtAddInfo;
	
	@FindBy(id = "phone")
	private WebElement txtPhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement txtPhoneMobile;
	
	@FindBy(id = "alias")
	private WebElement txtAlias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAccount;
	
	
	public void gotoSignin() {
		menuSignin.click();
	}
	
	public void inputEmail(String email) {
		txtEmail.sendKeys(email, Keys.TAB, Keys.ENTER);
	}
	
	public void inputGender(int selection) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		switch(selection) {
		case 1 :
			wait.until(ExpectedConditions.elementToBeClickable(txtGenderMr));
			txtGenderMr.click();
			break;
		case 2 :
			wait.until(ExpectedConditions.elementToBeClickable(txtGenderMrs));
			txtGenderMrs.click();
			break;
		}
	}
	
	public void inputFirstname(String firstname) {
		txtFirstname.sendKeys(firstname);
	}
	
	public void inputLastname(String lastname) {
		txtLastname.sendKeys(lastname);
	}
	
	public void inputEmailUser(String email) {
		txtEmailUser.sendKeys(email);
	}
	
	public void inputPassword(String password) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		txtPassword.sendKeys(password);
	}
	
	public void inputDateofBirth(String inDays, String inMonth, String inYears) {
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue(inDays);
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue(inMonth);
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue(inYears);
	}
	
	public void inputNewsletter() {
		txtNewsletter.click();
	}
	
	public void inputOptin() {
		txtOptin.click();
	}
	
	///// YOUR ADDRESS
	public void inputFirstnameAddress(String firstname) {
		txtFirstnameAddress.sendKeys(firstname);
	}
	
	public void inputLastnameAddress(String lastname) {
		txtLastnameAddress.sendKeys(lastname);
	}
	
	public void inputCompany(String company) {
		txtCompany.sendKeys(company);
	}
	
	public void inputAddress1(String address1) {
		txtAddress1.sendKeys(address1);
	}
	
	public void inputAddress2(String address2) {
		txtAddress2.sendKeys(address2);
	}
	
	public void inputCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void inputState(String state) {
		Select states = new Select(driver.findElement(By.id("id_state")));
		states.selectByValue(state);
	}
	
	public void inputPostcode(String postcode) {
		txtPostcode.sendKeys(postcode);
	}
	
	public void inputCountry(String country) {
		Select countrys = new Select(driver.findElement(By.id("id_country")));
		countrys.selectByValue(country);
	}
	
	public void inputAdditionalInfo(String addinfo) {
		txtAddInfo.sendKeys(addinfo);
	}
	
	public void inputPhoneHome(String phoneHome) {
		txtPhone.sendKeys(phoneHome);
	}
	
	public void inputPhoneMobile(String phoneMobile) {
		txtPhoneMobile.sendKeys(phoneMobile);
	}
	
	public void inputAlias(String alias) {
		txtAlias.clear();
		txtAlias.sendKeys(alias);
	}
	
	public void inputSubmitAccount() {
		btnSubmitAccount.click();
	}
}
