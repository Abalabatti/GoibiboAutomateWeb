package Ameer.GoibiboPrjPOMPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchTwoWayFlightPageTC05 {

	public SearchTwoWayFlightPageTC05(WebDriver d) {
		PageFactory.initElements(d, this);
	}


	@FindBy(xpath = "(//span[@class=\"sc-12foipm-84 CHCvS\"])[1]")
	WebElement FststRoundTripRadioBtn;

	public void ClickOnRoundTripRadBtn(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FststRoundTripRadioBtn.click();
	}


	 @FindBy(xpath="(//label[@class=\"search-widget-uistyles__RadioLabel-sc-f6e3g4-3 ijwIlZ\"])[2]")
	WebElement SecndRoundTripRadBtn;
	
	public void VerifyTwoWayFlightsSearching(WebDriver d) {

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebDriverWait wd=new WebDriverWait(d,Duration.ofSeconds(15));
//		wd.until(ExpectedConditions.elementSelectionStateToBe(OneWayFlightradBtn, true));
		// boolean s2=OneWayFlightradBtn.isDisplayed();
		boolean s1 = SecndRoundTripRadBtn.isSelected();
		Assert.assertEquals(s1, true);
		// Assert.assertEquals(s2, true);
	}
	
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[3]")WebElement CalIcon;
	
	public void ClickOnCalIcon() {
		CalIcon.click();
	}
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[4]")WebElement RtnCalIcon;
	
	public void ClickOnReturnCalIcon() {
		RtnCalIcon.click();
	}
	
	@FindBy(xpath="//div[@aria-label=\"Thu Aug 01 2024\"]")WebElement RtnDate;
	
	public void SelRtnDate() {
		RtnDate.click();
	}
	
}
