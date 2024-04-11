package Ameer.GoibiboPrjPOMPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchOneWayFlightPageTC04 {
	
	public SearchOneWayFlightPageTC04(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement Close_the_window_popup;
	
	public void Close_the_Mobile_window()
	{
		Close_the_window_popup.click();
	}
	
	@FindBy(xpath="//p[@class=\"sc-jlwm9r-1 ewETUe\"]")WebElement Clsadv;
	
	public void CloseGoibioAd() {
		Clsadv.click();
	}
	//@FindBy(xpath="(//p[@class=\"sc-12foipm-20 bhnHeQ\"])[1]")WebElement from;
	@FindBy(xpath="(//p[text()=\"Enter city or airport\"])[1]")WebElement from;
	
	@FindBy(xpath="(//p[@class=\"sc-12foipm-20 bhnHeQ\"])[2]")WebElement To;
	
	
	
	@FindBy(xpath="//div//input[@type=\"text\"]")WebElement EnterFromcity;
	public void EnterFromCity(/*WebDriver d*/) {
		
//		String inputText = "goa";
//		String js = "arguments[0].setAttribute('value','"+inputText+"')";
//		((JavascriptExecutor) d).executeScript(js, from);
		from.click();
		EnterFromcity.sendKeys("bangalore");
		fromdpd1.click();
	}
	
	@FindBy(xpath="//ul[@id=\"autoSuggest-list\"]")List <WebElement> fromdpd;
	
	@FindBy(xpath="//ul//li[@tabindex=\"1\"]")WebElement fromdpd1;
	
	@FindBy(xpath="//ul//li[@tabindex=\"0\"]")WebElement Todpd0;
	
	
	public void EnterToCity() {
		EnterFromcity.sendKeys("mumbai");
		Todpd0.click();
	}
	
	@FindBy(xpath="//span[@aria-label=\"Next Month\"]")WebElement Calnextbtn;
	
	public void DoubleClickOnCalenderNextBtn(WebDriver d) {
		Actions act=new Actions(d);
		act.doubleClick(Calnextbtn).perform();
	}
	
	@FindBy(xpath="//div[@aria-label=\"Tue Jun 04 2024\"]")WebElement SelcJun4th2024;
	@FindBy(xpath="//div//span[@class=\"fswTrvl__done\"]")WebElement CalDoneBtn;

	
	public void SelDepDJun4th2024(WebDriver d) {
		Actions sd=new Actions(d);
		sd.doubleClick(SelcJun4th2024).perform();
		//SelcJun4th2024.click();
		
		//CalDoneBtn.click();
	}
	
	@FindBy(xpath="//div//a[@class=\"sc-12foipm-78 cBPtpd\"]")WebElement SelAdultDone;

	public void ClickOnAdultDoneBtn() {
		
		SelAdultDone.click();
	}
	
	@FindBy(xpath="//div//span[text()=\"SEARCH FLIGHTS\"]")WebElement SearchFlight;
	@FindBy(xpath="//div//span[@class=\"fswTrvl__done\"]")WebElement DateDone;
	
	public void ClickOnSearchFlights() throws InterruptedException {
		
//		WebDriverWait expwait= new WebDriverWait(d,Duration.ofSeconds(20));// explicit wait until appearance of search bar
//		expwait.until(ExpectedConditions.visibilityOf(SearchFlight));
		SearchFlight.click();
//		DateDone.click();
		Thread.sleep(4000);
		
	}
	
	@FindBy(xpath="(//label[@for=\"radio-1\"])[1]")WebElement OneWayFlightradBtn;
	
	@FindBy(xpath="//input[@value=\"1 Traveller(s), Economy\"]")WebElement EcoClass;
	
	public void VerifyOneWayFlightsSearching(WebDriver d) throws InterruptedException {
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebDriverWait wd=new WebDriverWait(d,Duration.ofSeconds(15));
//		wd.until(ExpectedConditions.elementSelectionStateToBe(OneWayFlightradBtn, true));
		//boolean s2=OneWayFlightradBtn.isDisplayed();
		boolean s1=OneWayFlightradBtn.isSelected();
		String s3=EcoClass.getAttribute("value");
		Assert.assertEquals(s3,"1 Traveller(s), Economy" );
		//Thread.sleep(4000);
		//Assert.assertEquals(s2, true);
	}
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[5]")WebElement AdultIcon;
	
	public void ClickOnSelAdult() {
		AdultIcon.click();
	}
	
}
