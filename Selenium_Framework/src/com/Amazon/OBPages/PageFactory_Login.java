/**
 * 
 */
package com.Amazon.OBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Romesh
 *
 */
public class PageFactory_Login {
	
	WebElement driver;
	
	public PageFactory_Login() {
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using ="ap_email")
	WebElement UserID;
	
	@FindBy(how=How.ID,using ="continue")
	WebElement ContinueBTN;
	
	@FindBy(how=How.ID,using ="ap_password")
	WebElement Pwd;
	
	@FindBy(how=How.ID,using ="signInSubmit")
	WebElement LoginBtn;
	
	
	public void Login(String Uid,String pwd){
		UserID.sendKeys(Uid);
		ContinueBTN.click();
		Pwd.sendKeys(pwd);
		LoginBtn.click();
	}


}
