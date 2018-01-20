package com.Learnautomation.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoforMaven {
	
	@Test(groups={"Regression","Functional"})
	public void Maven1()
	{
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Romesh\\Downloads\\FireFox Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");*/
		System.out.println("Maven1");
	}
	@Test(groups={"Regression"})
	public void Maven2()
	{
		System.out.println("Maven 2");
	}

	@Test(groups={"Functional"})
	public void Maven3()
	{
		System.out.println("Maven 3");
	}
	

}
