package Ameer.GoibiboPrjPOMTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

/* Reach till payments page and select credit card option→ enter card option → make the payment */

import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.GoibiboTC15srcPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.MultiPassengerBookingTC09Page;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import Ameer.GoibiboPrjPOMPages.TC08SrcPage;
import GoibiboBase.GoibiboLaunchandQuit;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC15 extends GoibiboLaunchandQuit{
	
	@Test
	@Parameters("Browser")

	public void BookFlightandDoPayment() throws InterruptedException {
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
		MultiPassengerBookingTC09Page de=new MultiPassengerBookingTC09Page(d);
		de.AddMoreAdultMem();
		//pr.SelSeeFromcity();
		de.ClickandEnterSecToCity();
		pr.ClickSecDepdate();
		bul.DoubleClickOnCalenderNextBtn(d);
		pr.SelSecDepDate();
		bul.ClickOnSearchFlights();
		TC08SrcPage df=new TC08SrcPage(d);
		df.ClickOnBook();
		df.ClickOnImpInfoCB();
		df.ClickOnUrPinCodeStateCB();
		de.SelectGenderfromDpd();
		de.EnterTravelerDetail();
		//de.SelectDocType(d);
		de.SelAdult2();
		de.SelectGenderfromDpd();
		de.EnterAdult2Detail();
		de.SelAdult3();
		de.SelectGenderfromDpd();
		de.EnterAdult3Detail();
		
		//df.SelectDocType(d);
		df.ClickOnProceedBtn();
		df.ClickOnReviewConfirmBtn();
		GoibiboTC15srcPage cn=new GoibiboTC15srcPage(d);
		cn.ProceedToPayment();
		cn.payment_sel();
		cn.payment_val();
		
		
		
	}

}
