package AmazonMavenPOM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amz_ProductSortPageTC08 {
	
	public Amz_ProductSortPageTC08(WebDriver d){
		PageFactory.initElements(d,this);
	}

	@FindBy(css="span[aria-label=\"Sort by:\"]")WebElement SortBy;
	
	@FindBy(xpath="//select[@id=\"s-result-sort-select\"]")WebElement SortByOp;
	
	
	@FindBy(css="span[class=\"a-dropdown-prompt\"]") WebElement selectedVal;
	
	@FindBy(xpath="(//section[@aria-label=\"4 Stars & Up\"])[1]") WebElement CustReview4str;
	

	
	public void SortBY_Newest_Arrivals() {
		//SortBy.click();
		Select sfdd=new Select(SortByOp);
		//sfdd.deselectByVisibleText("Newest Arrivals");
		sfdd.selectByVisibleText("Newest Arrivals");
		System.out.println("Selected Value from Dropdown : " + selectedVal.getText());
		String ActualStr=selectedVal.getText();
		Assert.assertEquals(ActualStr, "Newest Arrivals");
		CustReview4str.click();
		boolean a=CustReview4str.isDisplayed();
		Assert.assertEquals(a,true);
		
	}

	//Price: Low to H
	public void SortBY_Cust_review() {
		//SortBy.click();
		Select sfdd=new Select(SortByOp);
		sfdd.selectByVisibleText("Avg. Customer Review");
		System.out.println("Selected Value from Dropdown : " + selectedVal.getText());
		String ActualStr=selectedVal.getText();
		Assert.assertEquals(ActualStr, "Avg. Customer Review");
		CustReview4str.click();
		boolean a=CustReview4str.isDisplayed();
		Assert.assertEquals(a,true);
		
	}
	
	public void SortBY_HightoLow() {
		//SortBy.click();
		Select sfdd=new Select(SortByOp);
		sfdd.selectByVisibleText("Price: High to Low");
		System.out.println("Selected Value from Dropdown : " + selectedVal.getText());
		String ActualStr=selectedVal.getText();
		Assert.assertEquals(ActualStr, "Price: High to Low");
		CustReview4str.click();
		boolean a=CustReview4str.isDisplayed();
		Assert.assertEquals(a,true);
		
	}
	
	public void SortBY_LowtoHigh() {
		//SortBy.click();
		Select sfdd=new Select(SortByOp);
		sfdd.selectByVisibleText("Price: Low to High");
		System.out.println("Selected Value from Dropdown : " + selectedVal.getText());
		String ActualStr=selectedVal.getText();
		Assert.assertEquals(ActualStr, "Price: Low to High");
		CustReview4str.click();
		boolean a=CustReview4str.isDisplayed();
		Assert.assertEquals(a,true);
		
	}
	
}
