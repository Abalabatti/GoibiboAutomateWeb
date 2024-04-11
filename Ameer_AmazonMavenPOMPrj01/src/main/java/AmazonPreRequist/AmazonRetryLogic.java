package AmazonPreRequist;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AmazonRetryLogic implements IRetryAnalyzer{
	
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
		return false;//dont retry the test case
		
	}

}
