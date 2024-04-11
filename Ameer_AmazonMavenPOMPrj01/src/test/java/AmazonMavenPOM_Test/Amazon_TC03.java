package AmazonMavenPOM_Test;
/* Verify Login fails with incorrect correct email or password  */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonPreRequist.AmazonListner;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC03 extends launchQuit{
	
	
	@Test(groups= {"smoke"},retryAnalyzer=AmazonPreRequist.AmazonRetryLogic.class,priority = 1)
	public void ValidateInvalidCredLogin() throws EncryptedDocumentException, IOException {
		
	//	FetchAmazonCredFromExcel.fetchAmzonInvCred();
		FetchAmazonCredFromExcel_01.fetchAmzonCred();

		Amz_LoginPage al=new Amz_LoginPage(d);
		al.HoverOnSignIn(d);
		al.ClickOnSignInBtn();
		al.EnterEmail();
		al.ClickOnContinueBtn();
		al.EnterInvalidPassword();
		al.ClickOnloginInBtn();
		al.VerifylnvalidLoErr();
	}
	
	
}
