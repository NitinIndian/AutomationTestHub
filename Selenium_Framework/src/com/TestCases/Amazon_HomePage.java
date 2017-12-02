package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon.Flib.BrowserFactory;
import com.Amazon.Flib.ReadExcel;
import com.Amazon.OBPages.PageFactory_Login;

public class Amazon_HomePage {
  @Test
  public void HomePage_Login() throws Exception {
	  
	 
	String url=ReadExcel.ReadExcelData(1,0,1);
	String browser=ReadExcel.ReadExcelData(1,1,1);
	WebDriver driver=BrowserFactory.StartBrower(browser, url);
	PageFactory_Login login= PageFactory.initElements(driver, PageFactory_Login.class);
	String userid=ReadExcel.ReadExcelData(1,2,1);
	String password=ReadExcel.ReadExcelData(1,3,1);
	login.Login(userid,password);
	  
  }
}
