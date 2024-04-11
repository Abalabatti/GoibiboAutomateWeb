package AmazonMavenPOM_Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
/* Verify that searching with filters (e.g., category, price range) yields accurate results */
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProductSearchWithFilterPageTC06;

@Listeners(AmazonPreRequist.AmazonListner.class)
public class Amazon_TC06 extends launchQuit{
/*Verify filtering with Mobile Computer Catagory >> Selecting Samsung mobiles price range from 5K to 10K */
	
	@Test(groups= {"system"},retryAnalyzer = AmazonPreRequist.AmazonRetryLogic.class)
	public void VerifyFilteredProductPrice() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		Amz_ProductSearchWithFilterPageTC06 aps=new Amz_ProductSearchWithFilterPageTC06(d);
		aps.ClickOnAllCat();
		aps.ClickOnMobileComputerCat();
		aps.ClickOnAllMobilePhns(d);
		aps.SelectBrandCheckBox();
		aps.ClickOnPrice5K_10K();
		aps.VerifySelectedFilter(); //Added Assertion for selected catagory Filter
		aps.VerifyListedProductprice();// Added assertion for all listed product price
		
		 
	}
}
