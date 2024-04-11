package AmazonMavenPOM_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_CheckOutPage {
	
	public Amz_CheckOutPage(WebDriver d){
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//input[@id=\"buy-now-button\"]") WebElement  ByeNow;
	
	public void ClickOnByeNow() {
		ByeNow.click();
	}
	
	@FindBy(xpath="//div[@class=\"a-column a-span5\"]//div//ul[@class=\"displayAddressUL\"]")
	WebElement Address;
	
	public void IsAddressSelected() {
		Assert.assertEquals(Address.isDisplayed(), true, "Address filed is displayed at checkout page");
	}
	
	
	@FindBy(xpath="//input[@aria-labelledby=\"orderSummaryPrimaryActionBtn-announce\"]")
	//@FindBy(xpath="//span[@id=\"pp-elhwXf-143\"]")
	WebElement UseThisPaymentMethodBtn;
	
	public void ClickOnUseThisPaymentMethodBtn(/*WebDriver d*/) {
//		WebDriverWait  wait=new WebDriverWait(d,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(UseThisPaymentMethodBtn));
		UseThisPaymentMethodBtn.click();
	}
	
	@FindBy(xpath="//div//h2//span[@class=\"break-word\"]")WebElement COD;
	
	public void IsCODSelected() {
		String a=COD.getText();
		Assert.assertEquals(a.contains("Pay on delivery"), true);
	}
	
	@FindBy(xpath="//div[@class=\"a-box-inner\"]//div[@class=\"a-row shipment\"]")WebElement OrderReview;
	
	public void IsOrdeReViewDisplayed() throws InterruptedException {
		Thread.sleep(3000);
//		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.ele)
		Assert.assertEquals(OrderReview.isDisplayed(), true);
		
	}
	
}
