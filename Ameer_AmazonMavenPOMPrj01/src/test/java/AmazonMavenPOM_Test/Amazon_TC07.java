package AmazonMavenPOM_Test;
/* Ensure that the product detail page displays all necessary information(price, reviews, description) */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProductPageTC07;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)
public class Amazon_TC07 extends launchQuit{
	
	@Test(groups= {"system","smoke"},retryAnalyzer = AmazonPreRequist.AmazonRetryLogic.class)
	public void Verify_Price_Review_Descri() throws EncryptedDocumentException, IOException {
		
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		Amz_ProductPageTC07 aps=new Amz_ProductPageTC07(d);
		aps.AmazonsearchProduct();
		aps.verifyprodes(d);
		aps.VerifyReview_Price_Descrip();
		
	}
	
}