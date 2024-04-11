package Ameer.GoibiboPrjPOMTests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
/*  Check if user is able to search the domestic round trip flight */
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import GoibiboBase.GoibiboLaunchandQuit;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC14 extends GoibiboLaunchandQuit{
	
	@Test(groups="Smoke")
	@Parameters("Browser")

	public void ROundTripDomesticFlightSerach() throws InterruptedException {
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.Close_the_Mobile_window();
		SearchOneWayFlightPageTC04 bul=new SearchOneWayFlightPageTC04(d);
		bul.CloseGoibioAd();
		SearchTwoWayFlightPageTC05 gh=new SearchTwoWayFlightPageTC05(d);
		gh.ClickOnRoundTripRadBtn(d);
		bul.EnterFromCity();
		bul.EnterToCity();
		gh.ClickOnCalIcon();
		bul.DoubleClickOnCalenderNextBtn(d);
		bul.SelDepDJun4th2024(d);
		gh.ClickOnReturnCalIcon();
		bul.DoubleClickOnCalenderNextBtn(d);
		gh.SelRtnDate();
		bul.ClickOnSearchFlights();
//		gh.VerifyTwoWayFlightsSearching(d);
		
	}
	
}
