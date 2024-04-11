package AmazonMavenPOM_Test;
/* Test searching for products using its name like shoe */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProductSearchPageTC05;
import AmazonPreRequist.AmazonListner;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC05 extends launchQuit{

	@Test(groups= {"system","smoke"},retryAnalyzer=AmazonPreRequist.AmazonRetryLogic.class)
	public void AmazonSearchProduct() throws EncryptedDocumentException, IOException {
		
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		lp.AmazonsearchProduct();
		Amz_ProductSearchPageTC05 ap=new Amz_ProductSearchPageTC05(d);
		ap.ValidateSearchResult();
		
	}
	
}
