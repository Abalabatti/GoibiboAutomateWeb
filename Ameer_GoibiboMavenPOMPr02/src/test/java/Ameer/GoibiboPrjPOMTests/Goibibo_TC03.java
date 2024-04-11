package Ameer.GoibiboPrjPOMTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

/* Test login with invalid credentials and ensure proper error messages are displayed */

import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC03 extends GoibiboLaunchandQuit{
	
	@Test(groups= {"Smoke","System"})
	@Parameters("Browser")

	public void LoginWithInvalidCred() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage def=new GoibiboRegisterPage(d);
		def.EnterMobileNo();
		def.EnterInvalidOTP();
		
	}

}
