package Ameer.GoibiboPrjPOMTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
/* Validate search results for different classes (economy, business, first class */
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import Ameer.GoibiboPrjPOMPages.SearchresultForDifferentClassPageTC06;
import GoibiboBase.GoibiboLaunchandQuit;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC06 extends GoibiboLaunchandQuit{

	@Test(groups="Smoke")
	@Parameters("Browser")

	public void FlightSearchBussinessClass() throws InterruptedException {
		
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
		SearchresultForDifferentClassPageTC06 bn=new SearchresultForDifferentClassPageTC06(d);
		bn.ClickOnAdult();
		bn.FlightSearchforBussinessClass();
		bul.ClickOnAdultDoneBtn();
		bul.ClickOnSearchFlights();
		bn.VerifyAtSearchPageBussinessFlightareShowing();
	}
}
