package Ameer.GoibiboPrjPOMTests;

/* Login to page, search the flight and logout */


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.GoibiboTC12srcPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.MultiPassengerBookingTC09Page;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC12 extends GoibiboLaunchandQuit{
	
	@Test
	@Parameters("Browser")

	public void LoginSerchFlightLogOut() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.EnterMobileNo();
		def.VerifyLoginSuccessful(d);
		Thread.sleep(2500);
		
//		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
//		def.Close_the_Mobile_window();
		SearchOneWayFlightPageTC04 bul=new SearchOneWayFlightPageTC04(d);
//		bul.CloseGoibioAd();
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
	
		GoibiboTC12srcPage cv=new GoibiboTC12srcPage(d);
		cv.HoverOnProfileandViewProfile(d);
		cv.ClikOnLogout();
		cv.ClickOnYesLogouBtn();
		
	}
	
}
