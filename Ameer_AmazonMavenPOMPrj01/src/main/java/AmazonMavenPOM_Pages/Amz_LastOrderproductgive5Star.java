package AmazonMavenPOM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_LastOrderproductgive5Star {
	
	public	Amz_LastOrderproductgive5Star(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@id=\"nav_prefetch_yourorders\"]") WebElement yourorder;
	
	public void ClickOnYourorder() {
		yourorder.click();
		}
	
	@FindBy(xpath="//a[@id=\"Write-a-product-review_2\"]") WebElement ProdReview;
	
	public void ClickOnProdreview() {
		ProdReview.click();
	}
	
	@FindBy(xpath="(//button[@class=\"ryp__star__button\"])[4]") WebElement FourStar;
	
	
	@FindBy(xpath="//span[@class=\"a-color-link\"]") WebElement ClearStar;

	public void ClickOn5star() throws InterruptedException {
		
		//boolean b1=ClearStar.isDisplayed();
//		try {
//			ClearStar.isDisplayed();
//			
//		}
//		catch(Exception e){
//		    FiveStar.click();
//
//		}
		
		if(ClearStar.isDisplayed()) {			
			
			ClearStar.click();
			Thread.sleep(3000);
			FourStar.click();
		}
		else {
		
			FourStar.click();
		}
	}
	
	
	
}
