package com.Learnautomation.selenium1;

import org.testng.annotations.Test;

public class Demo2TestNG {
	
	
	@Test(groups={"Regression"})
	public void Demo1(){
		System.out.println("Demo1");
	}
	@Test(groups={"Functional"})
	public void Demo2(){
		System.out.println("Demo2");
	}

}
