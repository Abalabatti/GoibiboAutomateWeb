package AmazonMavenPOM_Test;

/* Test updating item quantities and removing items from the cart  */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_UpdateingCartProductPageTC10;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC10 extends launchQuit{
	
	@Test(groups= {"smoke"})
	public void Abc() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		Amz_UpdateingCartProductPageTC10 apu=new Amz_UpdateingCartProductPageTC10(d);
		apu.ProductSearch();
		apu.ClickOnfrstPro();
		apu.AmzonWindowhandle(d);
		apu.UpdateQuanity();
		apu.ClickOnCart();
		apu.ClickOnGoToCart();
		apu.UpdateCartquantity();
		Thread.sleep(2000);
		apu.DeleteCart();
	}

}
