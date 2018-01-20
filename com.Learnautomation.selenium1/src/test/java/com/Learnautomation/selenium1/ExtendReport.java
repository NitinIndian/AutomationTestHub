package com.Learnautomation.selenium1;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Throwables;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReport {

	  ExtentReports extendreport;
	  ExtentTest logger;
	
	@BeforeTest
  public void f() {
		
		extendreport =new ExtentReports(System.getProperty("C:\\Users\\Nitin k\\Selenium\\com.Learnautomation.selenium\\src\\main\\resources\\Reports\\extendreport.html"),true);
		extendreport.addSystemInfo("Host Name","System testing")
		.addSystemInfo("Environment","Automation")
		.addSystemInfo("User Name","Nitin");
		extendreport.loadConfig(new File(System.getProperty("C:\\Users\\Nitin k\\Selenium\\com.Learnautomation.selenium1\\src\\main\\resources\\extent-config.xml")));
	  
	}
	
	@Test
	public void PassedTest(){
		logger=extendreport.startTest("Paased Test");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case passed");
		
		
  }
	
	@Test
	public void FailedTest(){
		logger=extendreport.startTest("Failed Test");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL, "Fail Test Case");	
  }
	
	@Test
	public void SkipTest(){
		logger=extendreport.startTest("Skip Test ");
		throw new SkipException("This is not ready for test");
	}
	
	@AfterMethod
	public void getresult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "testfailed"+result.getName());
		logger.log(LogStatus.FAIL, "TestFailed"+result.getThrowable());
	}else if(result.getStatus()==ITestResult.SKIP){
		logger.log(LogStatus.SKIP, "TestCase Skip"+result.getName());
		}
	}
}
