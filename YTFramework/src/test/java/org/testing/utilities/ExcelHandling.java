package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	private static final int Numeric = 0;
	private static final int STRING = 0;
	private static final int NUMERIC = 0;
	public void excelDataRead() throws IOException {
		File f = new File("../YTFramework/data.xlsx");   //Connection
		//File f = new File("../YTFramework/Sample_XLS_File.xlsx"); 
		
		FileInputStream fi = new FileInputStream(f);    //Stream Object
		XSSFWorkbook xs = new XSSFWorkbook(fi);        // Workbook Object
		XSSFSheet xt = xs.getSheetAt(0);	//Sheet object
		int r = xt.getPhysicalNumberOfRows();  //Fetch no of rows
		for(int i=0; i<r; i++) {   //Loop for rows
			XSSFRow xr = xt.getRow(i);  //row Object
			int c=xr.getPhysicalNumberOfCells();  //fetch no of columns
			
			for(int j=0; j<c; j++) {   //Loop for columns
				XSSFCell xc = xr.getCell(j);  //cell object
			    //System.out.println(xc.getNumericCellValue());     //Read the data
				System.out.println(xc.getStringCellValue());
				
			}
			}	
	}
	public static void main(String[] args) throws IOException {
		ExcelHandling e = new ExcelHandling();
		e.excelDataRead();
		
	}
}
