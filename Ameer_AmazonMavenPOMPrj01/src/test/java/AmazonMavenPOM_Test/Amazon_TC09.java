package AmazonMavenPOM_Test;

/* Verify that items can be added to the shopping cart from product pages */


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import AmazonMavenPOM_Pages.Amz_AddtoCartTC09Page;
import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC09 extends launchQuit{
	
	@Test(groups= {"smoke"},dataProvider="SearchProductsData", dataProviderClass = AmazonMavenPOM_Pages.Amz_AddtoCartTC09Page.class)
	public void Verify_Add_To_Cart(String a) throws EncryptedDocumentException, IOException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		Amz_AddtoCartTC09Page ref=new Amz_AddtoCartTC09Page(d);
		ref.searchfield(a);
		ref.ClickOnFistProd();
		ref.AmzonWindowhandle(d);
		ref.ClickOnCart();
		ref.VerifyAddedCartMsg();
		
		
	}
}
