package com.api.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener {
	
	private static final Logger logger=LogManager.getLogger(TestListners.class);
	
	public void onTestStart(ITestResult result) {
		logger.info("Test Suite Started");
	   
	  }
	public void onTestSuccess(ITestResult result) {
		 logger.info("Passed"+ result.getMethod().getMethodName());
		 logger.info("description"+ result.getMethod().getDescription());
		
	   
	  }
	 public void onTestFailure(ITestResult result) {
		 logger.info("Failed"+ result.getMethod().getMethodName());
		 logger.info("description"+ result.getMethod().getDescription());
		
		  }
	
	  public void onTestSkipped(ITestResult result) {
		  logger.info("Test Suite Skipped");
	   
	  
}
	  public void onFinish(ITestContext context) {
		  logger.info("Test Suite Completed");
		  }
	  public void onStart(ITestContext context) {
		  logger.info("Test Case Started");
		  }
}
