package com.utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReporter {

	public static ExtentReports Extent;
	
	public static ExtentReports createReport() {
		Extent = new ExtentReports("/home/jordanliucmcraf/eclipse-workspace/qc-maven/Reports/MyReport.html");
		return Extent;
	}
}
