package Ameer.GoibiboPrjPOMPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GoibiboUtil.FetchGoibiboCredFromExcel_01;

public class GoibiboRegisterPage extends FetchGoibiboCredFromExcel_01{

	public GoibiboRegisterPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@class=\"loginCont__input\"]")WebElement MobileNoFld;
	
	public void EnterMobileNo() throws InterruptedException {
		MobileNoFld.sendKeys(un);
		Thread.sleep(3000);
		
	}
	
	@FindBy(xpath="//div//p[@class=\"successMsg__subTitle\"]")
	WebElement LoginSuccessPopUp;
	
	public void VerifyLoginSuccessful(WebDriver d) {
		WebDriverWait sd=new WebDriverWait(d,Duration.ofSeconds(25));
		sd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//p[@class=\"successMsg__subTitle\"]")));
		String s1=LoginSuccessPopUp.getText();
		Assert.assertEquals(s1, "You have successfully logged in");
	}

	@FindBy(xpath="//div//input[@aria-label=\"Please enter verification code. Digit 1\"]")WebElement digi1;
	@FindBy(xpath="//div//input[@aria-label=\"Digit 2\"]") WebElement digi2;
	@FindBy(xpath="//div//input[@aria-label=\"Digit 3\"]") WebElement digi3;
	@FindBy(xpath="//div//input[@aria-label=\"Digit 4\"]") WebElement digi4;
	@FindBy(xpath="//p[@class=\"errorMessage\"]")WebElement errormsg;
	
	public void EnterInvalidOTP() {
		digi1.sendKeys("0");
		digi2.sendKeys("0");
		digi3.sendKeys("0");
		digi4.sendKeys("0");
		String s1=errormsg.getText();
		Assert.assertEquals(s1, "Please enter a valid OTP");
	
	}
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement Close_the_window_popup;
	
	
	public void Close_the_Mobile_window()
	{
		Close_the_window_popup.click();
		
	}
	
	
}
