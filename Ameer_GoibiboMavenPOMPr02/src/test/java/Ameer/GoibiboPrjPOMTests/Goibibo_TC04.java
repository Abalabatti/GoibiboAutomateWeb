package Ameer.GoibiboPrjPOMTests;

/* Test the search functionality for one-way flights. */


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC04 extends GoibiboLaunchandQuit{
	
	@Test(groups= {"Integration"})
	@Parameters("Browser")

	public void SearchOneWayFlight() throws EncryptedDocumentException, IOException, InterruptedException{
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.Close_the_Mobile_window();
		SearchOneWayFlightPageTC04 bul=new SearchOneWayFlightPageTC04(d);
		bul.CloseGoibioAd();
		bul.EnterFromCity();
		bul.EnterToCity();
		SearchTwoWayFlightPageTC05 gh=new SearchTwoWayFlightPageTC05(d);
		gh.ClickOnCalIcon();
		bul.DoubleClickOnCalenderNextBtn(d);
		bul.SelDepDJun4th2024(d);
		bul.ClickOnSelAdult();
		bul.ClickOnAdultDoneBtn();
		bul.ClickOnSearchFlights();
		bul.VerifyOneWayFlightsSearching(d);
	}

}
