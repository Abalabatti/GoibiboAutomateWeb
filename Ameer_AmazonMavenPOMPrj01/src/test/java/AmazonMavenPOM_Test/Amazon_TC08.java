package AmazonMavenPOM_Test;
/* Check if products can be sorted by relevance, price, rating etc  */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProductPageTC07;
import AmazonMavenPOM_Pages.Amz_ProductSortPageTC08;
/* Check if products can be sorted by relevance, price, rating etc */
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)
public class Amazon_TC08 extends launchQuit{
	
	
	@Test (groups= {"system","smoke"},retryAnalyzer = AmazonPreRequist.AmazonRetryLogic.class)
	public void SortProduct() throws EncryptedDocumentException, IOException {
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
		Amz_ProductSortPageTC08 ams=new Amz_ProductSortPageTC08(d);
		ams.SortBY_Newest_Arrivals();
		ams.SortBY_Cust_review();
		ams.SortBY_HightoLow();
		ams.SortBY_LowtoHigh();
	}
	
}
