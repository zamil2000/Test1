package testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{
int faildcount=0;
int limit=4;
	@Override
	public boolean retry(ITestResult result) {
		if(faildcount<limit) {
			faildcount++;
			return true;
		}
		return false;
	}

}
