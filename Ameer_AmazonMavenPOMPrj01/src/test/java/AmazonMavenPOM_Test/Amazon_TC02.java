package AmazonMavenPOM_Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
/* Verify Login is successfull with correct email and password  */
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonPreRequist.AmazonListner;
import AmazonPreRequist.launchQuit;
import TestDataUtil.FetchAmazonCredFromExcel_01;

/*Verify login amazon with valid email and Password*/

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC02 extends launchQuit{

	@Test(groups={"smoke"})/*,retryAnalyzer=AmazonPreRequist.AmazonRetryLogic.class*/
	//@Parameters("browser")

	public void VerifyValidLoginCred() throws EncryptedDocumentException, IOException {
		FetchAmazonCredFromExcel_01.fetchAmzonCred();
		Amz_LoginPage lp=new Amz_LoginPage(d);
		lp.HoverOnSignIn(d);
		lp.ClickOnSignInBtn();
		lp.EnterEmail();
		lp.ClickOnContinueBtn();
		lp.EnterPassword();
		lp.ClickOnloginInBtn();
		lp.ValidateUserName();
		
	}
}
