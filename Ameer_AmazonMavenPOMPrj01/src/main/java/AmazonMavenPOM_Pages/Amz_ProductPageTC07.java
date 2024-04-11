package AmazonMavenPOM_Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_ProductPageTC07 {
	
	public Amz_ProductPageTC07(WebDriver d){
		PageFactory.initElements(d,this);		
	}

	@FindBy(css ="input[type=\"text\"]")WebElement searchfild;
	
	public void AmazonsearchProduct() {
		searchfild.sendKeys("shirt");
		searchfild.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]")
	WebElement FstPro;
	
	public void verifyprodes(WebDriver d) {
		
		FstPro.click();
		Set<String> s1=d.getWindowHandles();
		Iterator<String> w1=s1.iterator();
		String Tab1=w1.next();//1stTab
		String Tab2=w1.next();//2ndTab
		d.switchTo().window(Tab2);
	}
	
	@FindBy(css="div[id=\"averageCustomerReviews\"]")WebElement Review;
	@FindBy(css="h1[id=\"title\"]")WebElement Descrip;
	@FindBy(xpath="(//span[@class=\"a-price-whole\"])[1]")WebElement Price;
	
	public void VerifyReview_Price_Descrip() {
		boolean Rb =Review.isDisplayed();
		boolean Db=Descrip.isDisplayed();
		boolean Pb=Price.isDisplayed();
		Assert.assertEquals(Rb, true);
		Assert.assertEquals(Db, true);
		Assert.assertEquals(Pb, true);
		
		
	}
	
}
