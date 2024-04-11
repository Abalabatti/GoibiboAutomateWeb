package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoibiboTC12srcPage {
	
	public GoibiboTC12srcPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	
	@FindBy(xpath="(//div[@role=\"presentation\"])[2]")WebElement ProfileOp;
	
	@FindBy(xpath="//div[@class=\"sc-ehixzo cETxmN\"]")WebElement ViewProfile;
	
	public void HoverOnProfileandViewProfile(WebDriver d) {
		Actions ho=new Actions(d);
		ho.moveToElement(ProfileOp).perform();
		ViewProfile.click();
	}

	@FindBy(xpath="//div//button[@class=\"sc-11civud-0 fzjMGi\"]")WebElement LogOut;
	
	public void ClikOnLogout() {
		LogOut.click();
	}
	
	@FindBy(xpath="//button[text()=\"Yes, Log out\"]")WebElement YesLogouBtn;
	
	public void ClickOnYesLogouBtn() {
		YesLogouBtn.click();
	}
}
