package Ameer.GoibiboPrjPOMTests;

import org.testng.annotations.Parameters;

/* Validate if after clicking on book button in the search page user is able to enter every test fields present like pincode, state, radio button, firstname, lastname, email id, mobile number, promo code etc */

import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.GoibiboTC11srcPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.MultiPassengerBookingTC09Page;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import Ameer.GoibiboPrjPOMPages.TC08SrcPage;
import GoibiboBase.GoibiboLaunchandQuit;

public class Goibibo_TC11 extends GoibiboLaunchandQuit{
	
	@Test(groups="Smoke")
	@Parameters("Browser")

	public void VerifySearchPageFieledsarePresent() throws InterruptedException {
		
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
		GoibiboTC11srcPage lk=new GoibiboTC11srcPage(d);
		lk.VerifyPincodeField();
		lk.VerifyStateField();
		lk.VerifyFstNameField();
		lk.VerifyLastNameField();
		lk.VerifyEmailField();
		lk.VerifyMobileNoField();
		
		
	}

}
