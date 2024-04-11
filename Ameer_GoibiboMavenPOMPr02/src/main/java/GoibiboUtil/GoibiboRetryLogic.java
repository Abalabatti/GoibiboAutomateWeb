package GoibiboUtil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class GoibiboRetryLogic implements IRetryAnalyzer{
	
	int retrytimes=3;
	int count=0;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retrytimes)
		{
			count++;
			return true;//retry the test case	
		}
		return false;
	}
	
	

}
