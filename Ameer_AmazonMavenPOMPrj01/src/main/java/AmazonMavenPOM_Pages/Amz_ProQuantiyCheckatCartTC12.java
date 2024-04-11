package AmazonMavenPOM_Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProQuantiyCheckatCartTC12 {

	public Amz_ProQuantiyCheckatCartTC12(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@value=\"Proceed to checkout\"]")WebElement ProccedToBye;
	
	public void ClickOnProceedToBye() {
		ProccedToBye.click();
	}
	
	@FindBy(xpath="//span//input[@aria-labelledby=\"orderSummaryPrimaryActionBtn-announce\"]")WebElement UseThisAddress;
	
	public void ClickOnUseThisAddress() {
		UseThisAddress.click();
	}
	
	//@FindBy(xpath="//span//span[@id=\"orderSummaryPrimaryActionBtn-announce\"]")
	//@FindBy(xpath="//span[@id=\"pp-F7UkQA-143\"]")
	@FindBy(xpath="(//span[text()='Use this payment method'])[1]")
	WebElement UseThispayment;
	
	public void ClickOnUseThispayment(WebDriver d) {
//		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(25));
//		wait.until(ExpectedConditions.elementToBeClickable(UseThispayment));
		JavascriptExecutor executor=(JavascriptExecutor)d;
		executor.executeScript("arguments[0].click();",UseThispayment);
		//UseThispayment.click();
	}
	
	//@FindBy(xpath="//span[@id=\"orderSummaryPrimaryActionBtn\"]")
	@FindBy(xpath="//div//span[@id=\"pp-F7UkQA-143\"]")
	WebElement SaveQuantities;
	
	public void ClickOnSaveQuantities() {
		SaveQuantities.click();
	}
	
	@FindBy(xpath="//input[@placeholder=\"Enter Code\"]")WebElement CouponCode;
	
	public void EnterCouponCode() {
		CouponCode.sendKeys("Test@123");
	}
	
	@FindBy(xpath="//input[@value=\"Apply\"]")WebElement CupponApply;
	
	@FindBy(xpath="//div/p[text()=\"The promotional code you entered is not valid.\"]")WebElement CoupCodeAppText;
	
	public void ClickOnCupApply() {
		CupponApply.click();
		String s=CoupCodeAppText.getText();
		Assert.assertEquals(s, "The promotional code you entered is not valid.");
	}
	
	@FindBy(xpath="//span[@class=\"a-dropdown-prompt\"]")WebElement totalproSel;
	
	public void TotalProSelAtCheckOutPage() {
		String s=totalproSel.getText();
		System.out.println("Total product cout at checkout page : "+s);
	} 
	
}
