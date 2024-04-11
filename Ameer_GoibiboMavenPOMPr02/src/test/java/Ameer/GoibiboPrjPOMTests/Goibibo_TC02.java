package Ameer.GoibiboPrjPOMTests;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
/* Validate the login functionality with valid credentials. */
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

/* Validate the login functionality with valid credentials */
@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC02 extends GoibiboLaunchandQuit{
	
	@Test(groups= {"Smoke","System"},priority=2,invocationCount=2)
	@Parameters("Browser")

	public void LoginWithValidCred() throws InterruptedException, EncryptedDocumentException, IOException {
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.EnterMobileNo();
		def.VerifyLoginSuccessful(d);
	}

}
