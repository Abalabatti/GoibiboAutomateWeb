package AmazonMavenPOM_Test;

/* Reach till cart page without login in amazon application  */

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import AmazonMavenPOM_Pages.Amz_LoginPage;
import AmazonMavenPOM_Pages.Amz_UpdateingCartProductPageTC10;

import AmazonPreRequist.launchQuit;

public class Amazon_TC15 extends launchQuit{
	
	@Test(groups={"system"})
	public void NavigateToCartPageWithOutLogin() {
		
		Amz_LoginPage vf=new Amz_LoginPage(d);
		vf.AmazonsearchProduct();
		Amz_UpdateingCartProductPageTC10 gh=new Amz_UpdateingCartProductPageTC10(d);
		gh.ClickOnfrstPro();
		gh.AmzonWindowhandle(d);
		gh.ClickOnCart();
		gh.ClickOnGoToCart();
	
	
	}
	
}
