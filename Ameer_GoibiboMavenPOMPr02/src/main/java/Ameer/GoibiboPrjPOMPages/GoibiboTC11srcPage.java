package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoibiboTC11srcPage {
	
	public GoibiboTC11srcPage(WebDriver d){
		PageFactory.initElements(d,this);		
	}
	
	@FindBy(xpath="//div//input[@id=\"Pincode\"]")WebElement Pincode;
	
	public void VerifyPincodeField() {
		Assert.assertEquals(Pincode.isDisplayed(), true);
		Assert.assertEquals(Pincode.isEnabled(), true);
	}
	
	//@FindBy(xpath="//div//label[@class=\"sc-eulNck fCijxV\"]")WebElement State;
	@FindBy(xpath="//div[@class=\"sc-lnPyaJ dEHJVt\"]")WebElement State;
	
	public void VerifyStateField() {
		Assert.assertEquals(State.isDisplayed(),true);
		Assert.assertEquals(State.isEnabled(), true);
		//Assert.assertEquals(State.isSelected(), true);
	}
	
	@FindBy(xpath="//div//input[@placeholder=\"First & Middle Name\"]")WebElement FstName;
	
	public void VerifyFstNameField() {
		Assert.assertEquals(FstName.isDisplayed(), true);
		Assert.assertEquals(FstName.isEnabled(), true);
	}
	
	@FindBy(xpath="//div//input[@placeholder=\"Last Name\"]")WebElement LastName;

	public void VerifyLastNameField() {
		Assert.assertEquals(LastName.isDisplayed(), true);
		Assert.assertEquals(LastName.isEnabled(), true);
	}
	
	@FindBy(xpath="//div//input[@placeholder=\"Email\"]")WebElement Email;
	
	public void VerifyEmailField() {
		Assert.assertEquals(Email.isDisplayed(), true);
		Assert.assertEquals(Email.isEnabled(), true);
	}
	
	@FindBy(xpath="//div//input[@placeholder=\"Mobile No\"]")WebElement MobileNo;
	
	public void VerifyMobileNoField() {
		Assert.assertEquals(MobileNo.isDisplayed(), true);
		Assert.assertEquals(MobileNo.isEnabled(), true);
	}

}
