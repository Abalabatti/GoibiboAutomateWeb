package AmazonMavenPOM_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amz_AddtoCartTC09Page {
	
	@DataProvider(name="SearchProductsData")
	public static Object[][] AmazonSearchProduct(){
		return new  Object[][] {{"Shirt"}};
		
	}
	
	@FindBy(css ="input[type=\"text\"]")WebElement searchfild;

	
	public void searchfield(String searchproduct) {
		searchfild.sendKeys(searchproduct);
		searchfild.sendKeys(Keys.ENTER);
	}
	
	public Amz_AddtoCartTC09Page(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(xpath="(//div[@class=\"s-image-padding\"])[1]")WebElement FststProd;
	
	public void ClickOnFistProd() {
		FststProd.click();
	}
	
	public void AmzonWindowhandle(WebDriver d) {
		Set<String> s1=d.getWindowHandles();
		Iterator<String> w=s1.iterator();
		String tab1=w.next();
		String tab2=w.next();
		d.switchTo().window(tab2);
		
	}
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]") WebElement AddtoCart;
	
	public void ClickOnCart() {
		AddtoCart.click();
	}
	
	@FindBy(xpath="//h1[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
	WebElement CartAdded;
	
	public void VerifyAddedCartMsg() {
		String Actultext=CartAdded.getText();
		Assert.assertEquals(Actultext, "Added to Cart");
	}
	

}
