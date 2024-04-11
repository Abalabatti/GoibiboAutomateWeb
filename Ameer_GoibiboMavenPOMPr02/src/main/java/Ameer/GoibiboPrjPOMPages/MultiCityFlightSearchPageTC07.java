package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultiCityFlightSearchPageTC07 {
	
	public MultiCityFlightSearchPageTC07(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="(//span[@class=\"sc-12foipm-84 CHCvS\"])[2]")WebElement MultiCityCB;
	
	public void ClickOnMultCityCB() {
		MultiCityCB.click();
	}
	
	@FindBy(xpath="(//p[@class=\"sc-12foipm-20 bhnHeQ\"])[1]")WebElement SecCityTofld;

	@FindBy(xpath="//input[@type=\"text\"]")WebElement Tofld;
	
	@FindBy(xpath="//li[@tabindex=\"0\"]")WebElement FstdpdCity;
	
	public void ClickandEnterSecToCity() {
		//SecCityTofld.click();
		Tofld.sendKeys("banglore");
		FstdpdCity.click();
	}
	
	@FindBy(xpath="//div[@aria-label=\"Wed Jun 12 2024\"]")WebElement SelcJun12th2024;
	@FindBy(xpath="//div//span[@class=\"fswTrvl__done\"]")WebElement CalDoneBtn;

	
	public void SelJun12th2024() {
		SelcJun12th2024.click();
		CalDoneBtn.click();
	}
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-44 csyyNa\"])[1]")WebElement secfromCity;
	
	public void SelSeeFromcity() {
		secfromCity.click();
	}
	
	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[7]")WebElement SecDepdate;
	
	public void ClickSecDepdate() {
		SecDepdate.click();
		
	}
	
	@FindBy(xpath="//div[@aria-label=\"Thu Aug 08 2024\"]")WebElement Aug8;
	
	public void SelSecDepDate() {
		Aug8.click();
	}

}
