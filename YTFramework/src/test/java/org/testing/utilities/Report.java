package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class Report {
	
	public static ExtentReports HandleReport() {
		ExtentReports extentReport = new ExtentReports("/Users/thangam/eclipse-workspace/YTScreenshots", false);
		return extentReport;
	}

}
