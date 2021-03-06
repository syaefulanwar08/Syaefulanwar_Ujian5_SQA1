package locator.pages.addToChart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locator.driver.DriverSingleton;

public class AddToChart {
	private WebDriver driver;
	
	public AddToChart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement menuDress;
	
	@FindBy(xpath = "//*[@id=\"list\"]/a")
	private WebElement gridList;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]")
	private WebElement btnAddtoChartDress;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	private WebElement btnCloseModalDress;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	private WebElement moveChart;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement menuTshirt;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]")
	private WebElement btnAddtoChartTshirt;
	
	
	
	public void gotoDress() {
		menuDress.click();
	}
	
	public void addToChartDress() {	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		gridList.click();
		
		btnAddtoChartDress.click();
	}
	
	public void closeModalDress() {
		btnCloseModalDress.click();
	}
	
	public void hoverChartDress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-800)");
		
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		action.clickAndHold(ele).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(ele)); 
	}
	
	public void gotoTshirt() {
		menuTshirt.click();
	}
	
	public void addToChartTshirt() {	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		btnAddtoChartTshirt.click();
	}
	
	public void closeModalTshirt() {
		btnCloseModalDress.click();
	}
	
	public void hoverChartTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-800)");
		
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		action.clickAndHold(ele).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(ele)); 
	}
	
}
