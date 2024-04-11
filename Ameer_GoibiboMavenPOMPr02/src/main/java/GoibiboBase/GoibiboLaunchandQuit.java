package GoibiboBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GoibiboLaunchandQuit {
	
	public static WebDriver d;
	
	@BeforeMethod
	@Parameters("Browser")

	public void launchGoibibo(String SelectBrowser){
		
		if(SelectBrowser.equals("Chrome")) {
			d=new ChromeDriver();
		}
		if(SelectBrowser.equals("Firefox")) {
			d=new FirefoxDriver();
		}
		if(SelectBrowser.equals("Edge")) {
			d=new EdgeDriver();
		}
		//d=new FirefoxDriver();
		d.navigate().to("https://www.goibibo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
//	@AfterMethod
//	public void QuiteGoibino() throws InterruptedException {
//		Thread.sleep(3000);
//		d.quit();
//	}

}
