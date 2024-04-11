package AmazonMavenPOM_Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProductSearchWithFilterPageTC06 {
	
	//String SelectedPrice;
	
	public Amz_ProductSearchWithFilterPageTC06(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(css="a[id=\"nav-hamburger-menu\"]")WebElement AllCatagory;
	
	public void ClickOnAllCat() throws InterruptedException {
		AllCatagory.click();
		Thread.sleep(4000);
	}
	
	@FindBy(xpath="//div[@id=\"hmenu-content\"]//ul//li//a//div[contains(text(),\"Mobiles, Computers\")]")
	WebElement Mobile_ComputerCatgory;
	
	public void ClickOnMobileComputerCat() throws InterruptedException {
		Mobile_ComputerCatgory.click();
		Thread.sleep(5000);
	}
	
	@FindBy(xpath="(//div[@id=\"hmenu-content\"]//ul//li//a[contains(text(),\"All Mobile Phones\")])[2]")
	WebElement AllMobilePhn;
	
	public void ClickOnAllMobilePhns(WebDriver d) {
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(AllMobilePhn));
		AllMobilePhn.click();
	}
	
	@FindBy(xpath="(//span[contains(text(),\"Samsung\")])[2]")
	WebElement SamsungBrand;
	
	public void SelectBrandCheckBox() {
		SamsungBrand.click();
		
	}
	
	@FindBy(xpath="//ul[@data-csa-c-content-id=\"1318502031\"]//li[@id=\"p_36/1318505031\"]//span//a//span")
	static WebElement Pr5K_10K;
	

	
	public void ClickOnPrice5K_10K() {
		String SelectedPrice=Pr5K_10K.getText();
		//SelectedPrice=this.SelectedPrice;
		System.out.println("Selected Price: "+SelectedPrice);
		Pr5K_10K.click();
		//₹5,000 - ₹10,000
		String StaringPrice=SelectedPrice.substring(1, 6);
		System.out.println("Starting price : "+StaringPrice);
		String Endprice=SelectedPrice.substring(10, 16);
		System.out.println("EndPrice :"+Endprice);
		
	}
	

	
	@FindBy(xpath="//li[@id=\"/Samsung\"]//span//a//span")WebElement AddedBrandFilter;
	
	@FindBy(xpath="//li[@id=\"/1318505031\"]//span//a//span")WebElement AddedPriceFilter;
	
	//@FindBy(xpath="//span//li[@id=\"p_36/1318505031\"]")WebElement pricesel;
	
	@FindBy(xpath="(//span[@class=\"a-size-base a-color-base a-text-bold\"])[3]")WebElement pricesel;
	
	@FindBy(xpath="(//div//label//input[@type=\"checkbox\"])[1]")WebElement BrandCheckBox;
	
	public void VerifySelectedFilter() {
		String S1=AddedBrandFilter.getText();
		//Assert.assertEquals(S1, AddedBrandFilter.getText());
		String S2=AddedPriceFilter.getText();
		//Assert.assertEquals(S2,AddedPriceFilter.getText());
		Assert.assertTrue(BrandCheckBox.isSelected());
		Assert.assertTrue(pricesel.isSelected());
		
	}
	
	@FindBy(css="span[class=\"a-price-whole\"]")
	List<WebElement> listedProductPrice;
	
	public void VerifyListedProductprice() {
		int count=listedProductPrice.size();
		for(int i=0;i<count-4;i++) {
			String a=listedProductPrice.get(i).getText();
			String Prvalue=a.replace(",", "");
			
//			System.out.println("Untrimmed Value"+a);
//			System.out.println("Trimmed value:"+a.substring(1));
//			String ProPrice=a.substring(1);
			int ActualPrice=Integer.parseInt(Prvalue);
			System.out.println("Product Value :"+ActualPrice);
			boolean result=(ActualPrice<=10000 || ActualPrice>=5000);
			Assert.assertEquals(result, true);
		}
	}
	
}
