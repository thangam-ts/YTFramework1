package org.testing.assertion;

import org.testing.utilities.LogsCapture;

//Soft Assertion
public class Assertt {
	
	public static void assertion1(String actual, String expected, String className) {
		if(actual.equals(expected)) {
			LogsCapture.takeLog(className, "Assertion is Passed");
		}
		else {
			LogsCapture.takeLog(className, "Assertion is Failed");
		}
	}

}
