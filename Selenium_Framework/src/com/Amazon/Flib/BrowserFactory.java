package com.Amazon.Flib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver StartBrower(String browserName,String URL ){
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Romesh\\Downloads\\FireFox Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver() ;
		}
		else if(browserName.equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
 
}
