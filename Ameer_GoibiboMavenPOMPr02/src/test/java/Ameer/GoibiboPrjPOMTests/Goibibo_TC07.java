package Ameer.GoibiboPrjPOMTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
/* Test for multi-city flight search */
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import GoibiboBase.GoibiboLaunchandQuit;

@Listeners(GoibiboBase.GoibiboListner.class)


public class Goibibo_TC07 extends GoibiboLaunchandQuit{
	@Test(groups={"System","Smoke"})
	@Parameters("Browser")

	public void MultiCityFlightSearch() throws InterruptedException {
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

		
	}
}
