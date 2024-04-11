package AmazonMavenPOM_Test;

import org.testng.annotations.Test;
/* Check if a user can successfully edit their profile information */
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
/* Check if user can successfully edit their profile information */
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_ProfilePage;
import AmazonPreRequist.AmazonListner;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;


@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC04 extends launchQuit{
	
	@Test(groups= {"system"},retryAnalyzer=AmazonPreRequist.AmazonRetryLogic.class)
	public void AmzonEditProfile() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_ProfilePage ap =new Amz_ProfilePage(d);
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		lp.ValidateUserName();
		lp.HoverOnSignIn(d);
		ap.ClickOnManageProfile();
		
		ap.ClickOnView(d);
		ap.ClickOnEditProfile(d);
		ap.ChangeName(d);
		ap.verifyprofilename(d);
		
	}

}
