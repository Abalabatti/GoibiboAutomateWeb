package AmazonMavenPOM_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_CheckOutPage;
import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_UpdateingCartProductPageTC10;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;


/*Validate the entire checkout process, including address selection, payment method selection, and order review*/

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC11 extends launchQuit{
	
	@Test(groups= {"system","smoke"})
	public void VerifyProChekOut_Address_PaymentMethod_Orderreview() throws EncryptedDocumentException, IOException, InterruptedException {
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
		Amz_CheckOutPage acp=new Amz_CheckOutPage(d);
		acp.ClickOnByeNow();
		acp.IsAddressSelected();
		acp.ClickOnUseThisPaymentMethodBtn();
		acp.IsCODSelected();
		acp.IsOrdeReViewDisplayed();
		
	}

}
