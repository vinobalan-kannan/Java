package framework.concepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	public void onStart(ITestContext context) {

		System.out.println("Test_Started");
	}

	public void onTestStart(ITestResult result) {

		System.out.println("TestCaseStarted");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test_Passed");
	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test_Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test_Skipped");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test_Finished");
	}

}
