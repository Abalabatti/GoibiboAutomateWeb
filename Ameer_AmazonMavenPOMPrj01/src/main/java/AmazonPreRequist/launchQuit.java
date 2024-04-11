package AmazonPreRequist;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class launchQuit {
	public static WebDriver d;

	@BeforeMethod(alwaysRun=true)
	public void launch() {
		
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod(alwaysRun=true)
	public void abc() throws InterruptedException {
		//Thread.sleep(2000);
		d.quit();
		
	}
}
