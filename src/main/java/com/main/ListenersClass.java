package com.main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;

public class ListenersClass implements ITestListener {

	ExtentReports Extent;
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is start!");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test is " + result.getName() + " Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test is " + result.getName() + " Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This test is " + result.getName() + " Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is end!");
	}

}
