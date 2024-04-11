package AmazonMavenPOM_Test;

/* Go to the orders page and click on your last ordered product and give 5 star ratings  */


import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import AmazonMavenPOM_Pages.Amz_LastOrderproductgive5Star;
import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

public class Amazon_TC14 extends launchQuit{
	
	@Test(groups={"smoke"})
	public void Give_5star_toLastOrderProduct() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		lp.ValidateUserName();
		lp.HoverOnSignIn(d);
		Amz_LastOrderproductgive5Star def=new Amz_LastOrderproductgive5Star(d);
		def.ClickOnYourorder();
		def.ClickOnProdreview();
		def.ClickOn5star();
		
	}

}
