package AmazonMavenPOM_Test;
/*Test if a new user can successfully register. */
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

/*Verify amazon new user registration is successful or not*/
//NOt completed because of new phono required.for every registration

import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_RegisterPage;
import AmazonPreRequist.AmazonListner;
import AmazonPreRequist.launchQuit;

@Listeners(AmazonPreRequist.AmazonListner.class)

public class Amazon_TC01 extends launchQuit{
	
	@Test(groups= {"smoke"},retryAnalyzer=AmazonPreRequist.AmazonRetryLogic.class)
	public void RegisterNewuser() {
		
		Amz_RegisterPage Ar=new Amz_RegisterPage(d);
		Ar.HoverOnSignIn(d);
		Ar.ClickOnRegisterLink();
		
		
		
	}

}
