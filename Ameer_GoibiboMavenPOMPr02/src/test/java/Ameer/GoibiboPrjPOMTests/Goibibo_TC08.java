package Ameer.GoibiboPrjPOMTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import Ameer.GoibiboPrjPOMPages.SearchresultForDifferentClassPageTC06;
import Ameer.GoibiboPrjPOMPages.TC08SrcPage;
import GoibiboBase.GoibiboLaunchandQuit;

/* Verify that the user is presented with additional options like-luggage, extra legroom, food/beverages, etc and selecting the same results in additional  cost with the booking amount  */

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC08 extends GoibiboLaunchandQuit{
	

	
	@Test(groups= {"Regression","System","Smoke"})
	@Parameters("Browser")

	
	public void SelExtraOptluggageLegroomFood() throws InterruptedException {
		
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.Close_the_Mobile_window();
		SearchOneWayFlightPageTC04 bul=new SearchOneWayFlightPageTC04(d);
		bul.CloseGoibioAd();
		MultiCityFlightSearchPageTC07 pr=new MultiCityFlightSearchPageTC07(d);
		pr.ClickOnMultCityCB();
		bul.EnterFromCity();
		bul.EnterToCity();
		SearchTwoWayFlightPageTC05 gh=new SearchTwoWayFlightPageTC05(d);
		gh.ClickOnCalIcon();
		bul.DoubleClickOnCalenderNextBtn(d);
		bul.SelDepDJun4th2024(d);
		bul.ClickOnSelAdult();
		//bul.ClickOnAdultDoneBtn();
		pr.SelSeeFromcity();
		pr.ClickandEnterSecToCity();
		pr.ClickSecDepdate();
		bul.DoubleClickOnCalenderNextBtn(d);
		pr.SelSecDepDate();
		bul.ClickOnSearchFlights();
		TC08SrcPage df=new TC08SrcPage(d);
		df.ClickOnBook();
		//df.ClickOnConfirmation();
		df.ClickOnImpInfoCB();
		df.ClickOnUrPinCodeStateCB();
		df.SelectGenderfromDpd();
		df.EnterTravelerDetail();
		df.ClickOnTravelDetailProceedBtn();
		df.EnterDocID();
		df.SelectDocType(d);
		df.ClickOnProceedBtn();
		//df.ConfirmPleaseWait();

		df.ClickOnReviewConfirmBtn();
		df.VerifyUnderSeatExterLegRoomAvailableorNOt();
		df.AddBevarage();
		df.Add10KgBaggage();
		df.ClickOnProceedPayment();
	}
}
