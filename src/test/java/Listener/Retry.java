package Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class Retry implements IRetryAnalyzer {

	int retrycount=0;
	int maxcount=2;
	public boolean retry(ITestResult result) 
	{
		if(retrycount<maxcount)
		{
			retrycount++;
			return true;
		}
		return false;
	}

	

}
