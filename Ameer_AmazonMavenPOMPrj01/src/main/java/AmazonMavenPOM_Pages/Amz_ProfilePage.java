package AmazonMavenPOM_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProfilePage {

	public Amz_ProfilePage(WebDriver d) {
    	PageFactory.initElements(d,this);
    }
	
	@FindBy(xpath="//span[@class=\"sc-ksBlkl sc-jRwbcX fedVjG fqsXfW\"]")
	WebElement ManageProfile;
	
	public void ClickOnManageProfile() throws InterruptedException {
		ManageProfile.click();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//button/div[@class=\"sc-kgTSHT fKJwkr\"]/a[text()=\"View\"]") WebElement View;
	
	public void ClickOnView(WebDriver d) {
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(View));
	
//		Actions ac=new Actions(d);
//		ac.doubleClick(View).perform();
		View.click();
	}
	
	@FindBy(xpath="//span[@class=\"editProfile\"]") WebElement EditProfile;
	
	public void ClickOnEditProfile(WebDriver d) {
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(EditProfile));
		EditProfile.click();
	}
	
	@FindBy(xpath="//input[@id=\"editProfileNameInputId\"]")WebElement EditName;
	
	@FindBy(xpath="//input[@aria-labelledby=\"editProfileContinueButton-announce\"]") WebElement EditProfileContinue;

	
	public void ChangeName(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		EditName.clear();
		EditName.sendKeys("Ameer");
//		WebDriverWait wait =new WebDriverWait(d,Duration.ofSeconds(25));
//		wait.until(ExpectedConditions.elementToBeClickable(EditProfileContinue));
//		Actions act=new Actions(d);
//		act.click(EditProfileContinue).perform();
		//EditProfileContinue.click();
	}
	
	public void ClickOnSaveEditedName(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		EditProfileContinue.click();
	}
	
	@FindBy(css = "div[class=\"profile-name desktop\"]")WebElement profilename;
	
	public void verifyprofilename(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String ActualString=profilename.getText();
		String ExpectedString="Ameer B"; 
		Assert.assertEquals(ActualString,ExpectedString);
		
	}
	
	
}
