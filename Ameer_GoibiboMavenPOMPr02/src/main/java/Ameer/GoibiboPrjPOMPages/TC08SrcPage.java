package Ameer.GoibiboPrjPOMPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC08SrcPage {
	
	public TC08SrcPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	

	@FindBy(xpath="//div[@class=\"sc-fifgRP iKzBkA\"]")WebElement SigInBtn;
	
	@FindBy(xpath="//div//li//button[@class=\"sc-kbhJrz kAfEHR\"]")WebElement SingInBox;
	
	public void HoverOnSignIn(WebDriver d) {
		Actions act1=new Actions(d);
		act1.moveToElement(SigInBtn).perform();
		
	}
	public void ClickOnSignIn() {
		SingInBox.click();
	}
	
	@FindBy(xpath="//div//input[@class=\"loginCont__input\"]")WebElement MblNo;
	
	public void EnterMblNo() {
		MblNo.sendKeys("8867296896");
	}
	
	//@FindBy(xpath="//div//button[text()=\"UPDATE SEARCH\"]")WebElement UpdateSearchBtn;
	@FindBy(xpath="//div//button[@class=\"dweb-commonstyles__ButtonBase-sc-13fxsy5-4 search-widget-uistyles__UpdateSearchBtn-sc-f6e3g4-13 eTrRGk cQWDnK\"]")
	WebElement UpdateSearchBtn; 
	
	public void UpdateSearch(WebDriver d) {
		WebDriverWait df=new WebDriverWait(d,Duration.ofSeconds(30));
		df.until(ExpectedConditions.elementToBeClickable(UpdateSearchBtn));
		UpdateSearchBtn.click();
	}
	
	//@FindBy(xpath="//button[@id=\"mc_ticket_summary_book_btn\"]")WebElement Book;
	@FindBy(xpath="//button[@id=\"mc_ticket_summary_book_btn\"]")WebElement Book;
	
	public void ClickOnBook() {
		Book.click();
	}
	
	@FindBy(xpath="//button[text()=\"OK\"]")WebElement ReConfirm;
	public void ClickOnConfirmation() {
		ReConfirm.click();
	}
	
	@FindBy(xpath="//span[@class=\"marginR5\"]")WebElement ImpInfoCB;
	
	public void ClickOnImpInfoCB() {
		ImpInfoCB.click();
	}
	
	@FindBy(xpath="//div//label[@for=\"confirm_check\"]")WebElement UrPinCodeStateCB;
	
	public void ClickOnUrPinCodeStateCB() {
		UrPinCodeStateCB.click();
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
		Email.sendKeys("Test123@gmail.com");
		Phno.sendKeys("8867296896");
//		ReConfirmationPopUp.click();

	}
	
	@FindBy(xpath="//div//button[@class=\"dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav f500 wid25 font16\"]")WebElement TravelDetailProceedBtn;
	
	public void ClickOnTravelDetailProceedBtn() {
		TravelDetailProceedBtn.click();
	}
	
	@FindBy(xpath="//div//button[text()=\"That’s Correct\"]")WebElement ReviewConfirmBtn;
	@FindBy(xpath="//div//button[@class=\"dweb-commonstyles__FltBtn-sc-13fxsy5-12 iocrTs font14\"]")WebElement ReConfirmationPopUp;
	
	
	public void ClickOnReviewConfirmBtn() {
		
		ReviewConfirmBtn.click();
	}
	
	@FindBy(xpath="//span[text()=\"Seats\"]")WebElement Seat;
	@FindBy(xpath="//span[text()=\"Extra leg-room\"]")WebElement ExtraLegRoom;
	
	public void VerifyUnderSeatExterLegRoomAvailableorNOt() {
		String s1=Seat.getText();
		Assert.assertEquals(s1,"Seats");
		ExtraLegRoom.click();
		
	}
	
	@FindBy(xpath="(//div//button[@class=\"baggagestyles__BHright-sc-1u4f2jb-30 pUCAt flexCol alignItemsCenter justifyCenter f500 font14\"])[1]")WebElement Bevarage;
	
	public void AddBevarage() {
		Bevarage.click();
	}
	
	@FindBy(xpath="(//div//button[@class=\"baggagestyles__BHright-sc-1u4f2jb-30 pUCAt flexCol alignItemsCenter justifyCenter f500 font14\"])[4]")WebElement Baggage;
	
	public void Add10KgBaggage() {
		Baggage.click();
	}
	
	@FindBy(xpath="//div//button[text()=\"Proceed To Payment\"]")WebElement Payment;
	
	public void ClickOnProceedPayment() {
		Payment.click();
	}
	public void ConfirmPleaseWait() {
		ReConfirmationPopUp.click();

	}
	
	@FindBy(xpath="(//span[@class=\"red width100 padT3\"])[1]")WebElement DocError;
	
	public void EnterDocID() {
		//String str=DocError.getText();
		//System.out.println("Error msg : "+ str);
		Assert.assertEquals(DocError.getText(), "Document ID Number is mandatory");
		if(DocError.isDisplayed()) {
			TravelerDoc.sendKeys("258765541258");
		}
	}
	
	@FindBy(xpath="//select[@class=\"common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee width100\"]")WebElement DocType;
	
	public void SelectDocType(WebDriver d) {
		Select rf=new Select(DocType);
		//rf.selectByValue("");
		rf.selectByIndex(1);
		//System.out.println(DocType.getSize());
	}
	
	@FindBy(xpath="//div//button[text()=\"Proceed\"]")WebElement ProceedBtn;
	
	public void ClickOnProceedBtn() {
		ProceedBtn.click();
	}
	
	
}


