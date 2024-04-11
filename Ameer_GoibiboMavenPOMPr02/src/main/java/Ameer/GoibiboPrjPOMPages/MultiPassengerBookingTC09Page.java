package Ameer.GoibiboPrjPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultiPassengerBookingTC09Page {
	
	public MultiPassengerBookingTC09Page(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	@FindBy(xpath="(//div//ul/li[@class=\"sc-12foipm-83 TdSAp\"]//span[@class=\"sc-12foipm-84 CHCvS\"])[1]")WebElement OneWayCB;
	
	public void ClickOnOneWay() {
		OneWayCB.click();
	}
	
	@FindBy(xpath="(//div//p[@class=\"sc-12foipm-18 cTPYom fswWidgetTitle\"])[2]")WebElement AddMorememBtfun; 
	@FindBy(xpath="(//span[@class=\"sc-12foipm-65 ljgJsP\"])[2]")WebElement PlusIcon;
	


	@FindBy(xpath="//div/a[@class=\"sc-12foipm-78 cBPtpd\"]")WebElement TrvDonebtn;
	
	public void ClickOnTrvDonebtn() {
		TrvDonebtn.click();
	}
	
	@FindBy(xpath="//span[text()=\"SEARCH FLIGHTS\"]")WebElement SechFlighBtn;
	
	public void ClickOnSechFlighBtn() {
		SechFlighBtn.click();
	}
	

	@FindBy(xpath="(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[4]")WebElement AdultIcon;
	
	@FindBy(xpath="//div//a[text()=\"Done\"]")WebElement AdultDoneBtn; 
	
	public void AddMoreAdultMem() throws InterruptedException {
		AdultIcon.click();
		PlusIcon.click();
		Thread.sleep(1000);
		PlusIcon.click();
		AdultDoneBtn.click();
	}

	@FindBy(xpath="(//p[@class=\"sc-12foipm-20 bhnHeQ\"])[1]")WebElement TosecCity;
	
	@FindBy(xpath="//input[@type=\"text\"]")WebElement Tofld;
	
	@FindBy(xpath="//li[@tabindex=\"0\"]")WebElement FstdpdCity;
	
	public void ClickandEnterSecToCity() {
		//SecCityTofld.click();
		TosecCity.click();
		Tofld.sendKeys("banglore");
		FstdpdCity.click();
	}
	
	@FindBy(xpath="//select[@class=\"common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee\"]")WebElement gender;
	
	public void SelectGenderfromDpd() {
		Select s1=new Select(gender);
		s1.selectByValue("MALE");
	}
	
	@FindBy(xpath="//div//input[@name=\"givenname\"]")WebElement TravelerName;
	@FindBy(xpath="//div//input[@name=\"lastname\"]")WebElement TravelerlastName;
	@FindBy(xpath="//div//input[@placeholder=\"Document ID Number\"]")WebElement TravelerDoc;
	@FindBy(xpath="//div//input[@placeholder=\"Email\"]")WebElement Email;
	@FindBy(xpath="//div//input[@placeholder=\"Mobile No\"]")WebElement Phno;
	
	public void EnterTravelerDetail() {
		TravelerName.sendKeys("Ameer");
		TravelerlastName.sendKeys("B");
		//TravelerDoc.sendKeys("258765541258");
		//Email.sendKeys("Test123@gmail.com");
		//Phno.sendKeys("8867296896");
		//ReConfirmationPopUp.click();

	}
	
	@FindBy(xpath="//select[@class=\"common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee width100\"]")WebElement DocType;
	
	public void SelectDocType(WebDriver d) {
		Select rf=new Select(DocType);
		//rf.selectByValue("");
		rf.selectByIndex(1);
		//System.out.println(DocType.getSize());
	}
	
	@FindBy(xpath="(//div[@class=\"traveller-detailsstyles__TravellerHdWrap-sc-1xqbced-7 fLJJka\"])[2]")WebElement Adult2;
	
	public void SelAdult2() {
		Adult2.click();
	}

	public void EnterAdult2Detail() {
		TravelerName.sendKeys("Sameer");
		TravelerlastName.sendKeys("B");
		//TravelerDoc.sendKeys("258765541258");
		
		//ReConfirmationPopUp.click();

	}
	
	@FindBy(xpath="(//div[@class=\"traveller-detailsstyles__TravellerHdWrap-sc-1xqbced-7 fLJJka\"])[3]")WebElement Adult3;
	
	public void SelAdult3() {
		Adult3.click();
		Email.sendKeys("Test123@gmail.com");
		Phno.sendKeys("8867296896");
	}
	
	public void EnterAdult3Detail() {
		TravelerName.sendKeys("Jameer");
		TravelerlastName.sendKeys("B");
		//TravelerDoc.sendKeys("258765541258");
		
		//ReConfirmationPopUp.click();

	}

}
