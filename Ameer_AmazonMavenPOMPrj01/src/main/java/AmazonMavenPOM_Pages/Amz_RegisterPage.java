package AmazonMavenPOM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_RegisterPage 
{
	/*Constructor for invoke each WebElement*/
    public Amz_RegisterPage(WebDriver d) {
    	PageFactory.initElements(d,this);
    }
    
    
	
	@FindBy(xpath="(//a[@class=\"nav-a\"])[1]") 
	WebElement RegisterLink;

	@FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
	WebElement SignInHover;
	
	
	
	public void HoverOnSignIn(WebDriver d) {
		Actions act=new Actions(d);
		act.moveToElement(SignInHover).perform();
	}
	
	public void ClickOnRegisterLink() {
		RegisterLink.click();
	}
	
	
	
	
}
