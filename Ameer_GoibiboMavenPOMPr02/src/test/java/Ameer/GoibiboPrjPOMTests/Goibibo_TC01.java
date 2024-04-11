package Ameer.GoibiboPrjPOMTests;

/* Verify that users can successfully register for a new account */

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ameer.GoibiboPrjPOMPages.GoibiboRegisterPage;
/* Verify that users can successfully register for a new account.- */
import GoibiboBase.GoibiboLaunchandQuit;
import GoibiboUtil.FetchGoibiboCredFromExcel_01;

@Listeners(GoibiboBase.GoibiboListner.class)

public class Goibibo_TC01 extends GoibiboLaunchandQuit{
	
	@Test(groups= {"System"})
	@Parameters("Browser")

	public void RegisterNewAccount() throws EncryptedDocumentException, IOException, InterruptedException {
		FetchGoibiboCredFromExcel_01.fetchGoibiboCred();
		GoibiboRegisterPage ref=new GoibiboRegisterPage(d);
		ref.EnterMobileNo();
		
	}
}
