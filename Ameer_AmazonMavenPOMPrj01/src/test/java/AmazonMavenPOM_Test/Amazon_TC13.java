package AmazonMavenPOM_Test;
import org.testng.annotations.Test;
/* Check if user is able to apply for coupon code while ordering the product */
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProQuantiyCheckatCartTC12;
import AmazonMavenPOM_Pages.Amz_UpdateingCartProductPageTC10;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

public class Amazon_TC13 extends launchQuit{
	
	@Test(groups= {"smoke"})
	public void ApplYCoupon() throws EncryptedDocumentException, IOException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		lp.ValidateUserName();
		Amz_UpdateingCartProductPageTC10 apu=new Amz_UpdateingCartProductPageTC10(d);
		apu.ProductSearch();
		apu.ClickOnfrstPro();
		apu.AmzonWindowhandle(d);
		apu.UpdateQuanity(); 
		apu.ClickOnCart();
		apu.ClickOnGoToCart();
		Amz_ProQuantiyCheckatCartTC12 ref=new Amz_ProQuantiyCheckatCartTC12(d);
		ref.ClickOnProceedToBye();
		ref.ClickOnUseThisAddress();
		ref.EnterCouponCode();
		ref.ClickOnCupApply();
	}

}
