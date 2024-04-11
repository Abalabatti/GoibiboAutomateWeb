package AmazonMavenPOM_Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_UpdateingCartProductPageTC10 {
	
	public Amz_UpdateingCartProductPageTC10(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	
	@FindBy(css ="input[type=\"text\"]")WebElement searchfild;

	public void ProductSearch() {
		searchfild.sendKeys("Shoe");
		searchfild.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="(//div[@class=\"s-image-padding\"])[1]")WebElement fstProduct;
	
	public void ClickOnfrstPro() {
		fstProduct.click();
	}
	
	public void AmzonWindowhandle(WebDriver d) {
		Set<String> s1=d.getWindowHandles();
		Iterator<String> w=s1.iterator();
		String tab1=w.next();
		String tab2=w.next();
		d.switchTo().window(tab2);
		
	}
	
	@FindBy(xpath="//select[@id=\"quantity\"]") WebElement qnt;
	
	public void UpdateQuanity() {
		Select sd=new Select(qnt);
		sd.selectByVisibleText("3");
		String SelectQnty=qnt.getText();
		//System.out.println("Selected product quanity at Product page" + SelectQnty);
	}
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]") WebElement AddtoCart;
	
	public void ClickOnCart() {
		AddtoCart.click();
	}
	
	@FindBy(xpath="//span[@id=\"sw-gtc\"]") WebElement Gotocart;
	@FindBy(xpath="//div[@class=\"a-row sc-cart-header sc-compact-bottom\"]") WebElement CartHeading; 
	
	public void ClickOnGoToCart() {
		Gotocart.click();
		Assert.assertEquals(CartHeading.getText(), "Shopping Cart");
	}
	
	@FindBy(xpath="//select[@name=\"quantity\"]") WebElement Cartqunt;
	
	public void UpdateCartquantity() {
		Select d1=new Select(Cartqunt);
		d1.selectByVisibleText("2");
	}
	@FindBy(xpath="//input[@value=\"Delete\"]") WebElement deletecart;
	
	public void DeleteCart() {
		deletecart.click();
	}
	
	@FindBy(xpath="//input[@id=\"buy-now-button\"]")WebElement ByeNow;
	
	public void ClickByeNow() {
		ByeNow.click();
	}
	
	
}
