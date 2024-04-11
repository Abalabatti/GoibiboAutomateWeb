package AmazonMavenPOM_Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_ProductSearchPageTC05 {
	
	public Amz_ProductSearchPageTC05(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")
	List<WebElement> searchresult;

	public void ValidateSearchResult() {
		System.out.println("No of product listed : "+searchresult.size());
		for(int i=0;i<searchresult.size();i++) 
		{
			String s1=searchresult.get(i).getText();
			String s2=s1.toLowerCase();
			boolean ActualResult=s2.contains("shoe");
			
			//System.out.println("is valid product : "+ActualResult);
			if(ActualResult) {
				System.out.println("The product is valid");
				Assert.assertEquals(ActualResult, true, "Product is valid");
				
			}
			else {
				System.out.println("The product is not valid");
				Assert.assertEquals(ActualResult, false, "Product not is valid");

			}
			
		}
	
	
	}
}
