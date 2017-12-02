/**
 * 
 */
package com.Amazon.OBPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author NItin
 * 
 * 
 * This class will store all the locator and method
 *
 */
public class LoginPages {
	
	WebDriver driver;
	
	By UseridTxt=By.id("ap_email");
	By ContinueBtn=By.id("continue");
	By PwdTxt=By.id("ap_password");
	By LoginBtn=By.id("signInSubmit");
	public LoginPages(WebDriver driver) {
		this.driver=driver;
		}
	
	public void UserID(String Uid){
		driver.findElement(UseridTxt).sendKeys(Uid);
	}
	
    public void ContinueBTN(){
    	
		driver.findElement(ContinueBtn).click();
	}
    
    public void Password(String Pwd){
    	
		driver.findElement(PwdTxt).sendKeys(Pwd);
	}
    public void LoginBtn(){
    	
		driver.findElement(LoginBtn).click();
	}
}
