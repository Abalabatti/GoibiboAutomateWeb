package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchresultForDifferentClassPageTC06 {
	
	public SearchresultForDifferentClassPageTC06(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	//@FindBy(xpath="//li[@class=\"sc-12foipm-59 eheTkF\"]")WebElement BussinessClass;
	@FindBy(xpath="//li[text()=\"business\"]")WebElement BussinessClass;
	
	public void FlightSearchforBussinessClass() {
		BussinessClass.click();
	}

	@FindBy(xpath="//input[@value=\"1 Traveller(s), Business\"]")WebElement Bussinessfld;
	
	public void VerifyAtSearchPageBussinessFlightareShowing() {
		String d=Bussinessfld.getAttribute("value");
		System.out.println("Actual search result"+ d);
		Assert.assertEquals(d,"1 Traveller(s), Business");
	}
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[5]")WebElement AdultIcon;
	
	public void ClickOnAdult() {
		AdultIcon.click();
	}
	
	

}
