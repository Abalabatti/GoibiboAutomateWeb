package GoibiboUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import GoibiboBase.GoibiboLaunchandQuit;

public class TakeScreenShootGoibibo extends GoibiboLaunchandQuit{
	
	public static void TSCPASS(/*WebDriver d*/) throws IOException {
		TakesScreenshot TS= (TakesScreenshot) d;
		File source=TS.getScreenshotAs(OutputType.FILE);
		File destini=new File("D:\\prgm\\Ameer_GoibiboPrj02\\GoibiboScreenShot\\GoibiboPass\\Pass"+Math.random()+".png");
		FileUtils.copyFile(source, destini);
	}
	
	public static void TSCFAIL(/*WebDriver d*/) throws IOException {
		TakesScreenshot Tb= (TakesScreenshot) d;
		File src=Tb.getScreenshotAs(OutputType.FILE);
		//File source=Tb.getScreenshotAs(OutputType.FILE);
		File destini=new File("D:\\prgm\\Ameer_GoibiboPrj02\\GoibiboScreenShot\\GoibiboFail\\Fail"+Math.random()+".png");
		FileUtils.copyFile(src, destini);
	}

}
