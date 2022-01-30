package com.main;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class SecondClass extends FirstClassMaven {
	
	@Test(dependsOnMethods="tm2")
	public void tm123() {
		System.out.println("Hello");
	}
	
}
