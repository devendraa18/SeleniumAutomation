package com.sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplemetITestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case has started..!!!"+result.toString());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case has passed..!!!"+result.toString());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case has failed..!!!"+result.toString());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution has been started..!!!!");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
