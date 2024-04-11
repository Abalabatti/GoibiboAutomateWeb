package Ameer.GoibiboPrjPOMTests;

/* Check if user is able to apply for coupon code while ordering the product  */

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import Ameer.GoibiboPrjPOMPages.GoiboTC13srcPage;
import Ameer.GoibiboPrjPOMPages.MultiCityFlightSearchPageTC07;
import Ameer.GoibiboPrjPOMPages.MultiPassengerBookingTC09Page;
import Ameer.GoibiboPrjPOMPages.SearchOneWayFlightPageTC04;
import Ameer.GoibiboPrjPOMPages.SearchTwoWayFlightPageTC05;
import Ameer.GoibiboPrjPOMPages.TC08SrcPage;
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC13 extends GoibiboLaunchandQuit{
	
	@Test
	@Parameters("Browser")

	public void VerifyApplyCouponCode() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.EnterMobileNo();
		def.VerifyLoginSuccessful(d);
		Thread.sleep(2500);
		
//		GoibiboRegisterPage def=new GoibiboRegist erPage(d);
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
		TC08SrcPage df=new TC08SrcPage(d);
		df.ClickOnBook();
		
		GoiboTC13srcPage fv=new GoiboTC13srcPage(d);
		fv.EnterCoupponCode();
		fv.VerifyAppliedCouponSuccess();
		
	}

}
