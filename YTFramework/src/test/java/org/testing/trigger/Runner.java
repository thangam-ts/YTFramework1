package org.testing.trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner {

	public static void main(String[] args) throws BiffException, IOException {

		XmlSuite xS = new XmlSuite(); // suite object
		xS.setName("Suite1"); // name set

		XmlTest xT = new XmlTest(xS); // test object

		File f = new File("/Users/thangam/Downloads/Book.xlsx"); // excel file

		Workbook wk = Workbook.getWorkbook(f);

		Sheet s = wk.getSheet(0);

		int rows = s.getRows();

		ArrayList<XmlClass> al = new ArrayList<XmlClass>();

		for (int i = 1; i < rows; i++) {

			Cell c = s.getCell(4, i);

			if (c.getContents().equals("Y")) {
				Cell pkg = s.getCell(2, i);
				Cell class_name = s.getCell(3, i);

				String v = pkg.getContents() + "." + class_name.getContents();

				XmlClass c1 = new XmlClass(v); //xml class

				al.add(c1);

			}

		}

		System.out.println(al.size());

		xT.setClasses(al);

		ArrayList<XmlTest> al2 = new ArrayList<XmlTest>();

		al2.add(xT);

		xS.setTests(al2);

		ArrayList<XmlSuite> al3 = new ArrayList<XmlSuite>();
		al3.add(xS);

		TestNG t = new TestNG();
		t.setXmlSuites(al3);
		t.run();

	}

}


