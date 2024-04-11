package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoiboTC13srcPage {
	
	public GoiboTC13srcPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//input[@id=\"goPromo\"]")WebElement couppon;
	
	@FindBy(xpath="//div//span[text()=\"VIEW ALL COUPONS\"]")WebElement ViewAllcoupon;
	
	@FindBy(xpath="(//span[@class=\"common-elementsstyles__CheckBox-sc-ilw4bs-2 TIWwk\"])[5]")
	WebElement SelCuponCB;
	
	public void EnterCoupponCode() {
		//couppon.sendKeys("Goibibo@200");
		ViewAllcoupon.click();
		SelCuponCB.click();
	}
	
	@FindBy(xpath="//div[text()=\"Awesome! Promo discount applied\"]")
	WebElement cupponappliedsuccess;
	
	public void VerifyAppliedCouponSuccess() {
		cupponappliedsuccess.isDisplayed();
		Assert.assertEquals(cupponappliedsuccess.isDisplayed(), true);
	}

}
