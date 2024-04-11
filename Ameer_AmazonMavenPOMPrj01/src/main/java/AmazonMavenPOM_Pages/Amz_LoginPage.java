package AmazonMavenPOM_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestData.FetchAmazonCredFromExcel;
import TestDataUtil.FetchAmazonCredFromExcel_01;

public class Amz_LoginPage extends FetchAmazonCredFromExcel_01
{
	
	//WebDriver d;

	/*Constructor for invoke each WebElement*/
    public Amz_LoginPage(WebDriver d) {
    	PageFactory.initElements(d,this);
    }
	
    @FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
	WebElement SignInHover;
    
    @FindBy(xpath="(//a[@data-nav-role=\"signin\"])[2]")
    WebElement SignInBtn;
    
    @FindBy(xpath="//input[@type=\"email\"]")
    WebElement Emailfld;
    
    @FindBy(xpath="//input[@id=\"continue\"]")
    WebElement ContinueBtn;
    
    @FindBy(xpath="//input[@id=\"ap_password\"]")
    WebElement psw;
    
	@FindBy(xpath="//span[@id=\"auth-signin-button\"]")
	WebElement loginIn_Btn;
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement helloUser;
	

	@FindBy(xpath="//span[@class=\"a-list-item\"]")
	WebElement lnvalidLoErr;
	
	@FindBy(css ="input[type=\"text\"]")WebElement searchfild;
	
	public void AmazonsearchProduct() {
		searchfild.sendKeys("shoe");
		searchfild.sendKeys(Keys.ENTER);
	}
    
    public void HoverOnSignIn(WebDriver d) {
		Actions act=new Actions(d);
		act.moveToElement(SignInHover).perform();
	}
    
  
    
    public void ClickOnSignInBtn() {
    	SignInBtn.click();
    }
    
   
    
    public void EnterEmail() {
    	Emailfld.sendKeys(un);
    }
    
   
    
    public void ClickOnContinueBtn() {
    	ContinueBtn.click();
    }
    
 
    
	public void EnterPassword() {
		psw.sendKeys(pasword);
	}
	 
	
	public void ClickOnloginInBtn() {
		loginIn_Btn.click();
	}
	

	
	public void ValidateUserName() {
		String username=helloUser.getText();
		boolean displyaed=helloUser.isDisplayed();
		System.out.println("Displayed user is : "+username);
		Assert.assertEquals(displyaed, true);
		//Assert.assertEquals(username, "Hello, Ameer");
	}
	
	//FetchAmazonCredFromExcel ref=new FetchAmazonCredFromExcel();
	
	
	public void EnterInvalidPassword() {
		psw.sendKeys(inpsw);
    }
	
	
	public void VerifylnvalidLoErr() {
		String lnvalidLoErrStr=lnvalidLoErr.getText();
		String ExoectedStr="Your password is incorrect";
		Assert.assertEquals(lnvalidLoErrStr, ExoectedStr, "Inavlid login password please check");
	}
}
