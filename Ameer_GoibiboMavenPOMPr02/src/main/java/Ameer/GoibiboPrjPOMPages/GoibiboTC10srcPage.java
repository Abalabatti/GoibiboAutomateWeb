package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoibiboTC10srcPage {
	
	public GoibiboTC10srcPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	
	@FindBy(xpath="(//div[@class=\"flight-detailstyles__TicketDetailWrap-sc-1i6unua-32 heMTZI\"])[1]")WebElement Flighinfo1;
	@FindBy(xpath="(//div[@class=\"flight-detailstyles__TicketDetailWrap-sc-1i6unua-32 heMTZI\"])[2]")WebElement  Flightinfo2;
	
	public void VerifyFlightInfo() {
		Assert.assertEquals(Flighinfo1.isDisplayed(), true);
		Assert.assertEquals(Flightinfo2.isDisplayed(),true);
	}

	@FindBy(xpath="//div//div[text()=\"Fare Summary\"]")WebElement faredetail;
	
	public void VerifyFareDetail() {
		Assert.assertEquals(faredetail.isDisplayed(), true);
	}

	@FindBy(xpath="(//div//span[text()=\"View Baggage Details\"])[1]")WebElement Bagagdetail1;
	@FindBy(xpath="(//div//span[text()=\"View Baggage Details\"])[2]")WebElement Bagagdetail2;
	@FindBy(xpath="(//div//span[text()=\"View Baggage Details\"])[3]")WebElement Bagagdetail3;
	@FindBy(xpath="(//div//span[text()=\"View Baggage Details\"])[4]")WebElement Bagagdetail4;

	public void VerifyBagageDetail() {
		Assert.assertEquals(Bagagdetail1.isDisplayed(), true);
		Assert.assertEquals(Bagagdetail2.isDisplayed(), true);
		Assert.assertEquals(Bagagdetail3.isDisplayed(), true);
		Assert.assertEquals(Bagagdetail4.isDisplayed(), true);
	}

	@FindBy(xpath="//div[text()=\"CANCELLATION & DATE CHANGE POLICY\"]")WebElement Cancelation;
	
	public void VerifyCancelationRule() {
		Assert.assertEquals(Cancelation.isDisplayed(),true);
	}
	
}
