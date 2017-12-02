/**
 * 
 */
package com.Amazon.Flib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Amazon.OBPages.LoginPages;

/**
 * @author Nitin
 * 
 * This class will contains all generic function
 *
 */
public class Func_Lib {
	
	WebDriver driver;
	
	public Func_Lib(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Login()
	{
		LoginPages Login=new LoginPages(driver);
		 Login.UserID("nitinkushwah189@gmail.com");
		 Login.ContinueBTN();
		 Login.Password("Omsai$1234");
		 Login.LoginBtn();
		
	}

}
