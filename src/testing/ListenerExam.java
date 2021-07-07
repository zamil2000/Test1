package testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExam implements ITestListener{

	public void onTestStart( ITestResult result) {
		System.out.println("test case going to exicute");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case going to success");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("test case going to faliure");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case going to skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test case going to faliedwith success");
	}
	public void onStart(ITestContext context) {
		System.out.println("test case going to Start");
	}
	public void onFinish(ITestContext context) {
		System.out.println("test case going to finish");
	}
	
	
	
}
