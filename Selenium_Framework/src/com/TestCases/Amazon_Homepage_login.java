package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Amazon.Flib.Func_Lib;
import com.Amazon.OBPages.LoginPages;

public class Amazon_Homepage_login {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Romesh\\Downloads\\FireFox Driver\\geckodriver.exe");        
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_signin&switch_account=");
	  
	 LoginPages Login=new LoginPages(driver);
	  Func_Lib RF=new Func_Lib(driver);
	 // RF.Login();
	  	Login.UserID("nitinkushwah189@gmail.com");
		Login.ContinueBTN();
		Login.Password("Omsai$1234");
		Login.LoginBtn();
		
		System.out.println("Git");
		
  }
}
