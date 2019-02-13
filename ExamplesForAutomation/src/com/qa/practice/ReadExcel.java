package com.qa.practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// spicify the location of excel file path
		File src= new File("C:\\Users\\User\\Desktop\\31 July 2017.xlsx");
		// read excel file 
		FileInputStream fis=new FileInputStream(src);
		//load complete excel book
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//to specify sheet 
	    XSSFSheet sheet= wb.getSheetAt(0);
	    int rowCount=sheet.getLastRowNum();
	    
	    System.out.println("Total row is:" + rowCount);
	    
	    for(int i=0; i<=rowCount; i++){
	    	Row row=sheet.getRow(i);
	    	for(int j=0;j<row.getLastCellNum(); j++){
	    		System.out.println();
	    		System.out.println(row.getCell(j).getStringCellValue());
	    	}
	    }
	    /*for(int i=0;i<=rowCount;i++){
	      
	    	String data0=sheet.getRow(i).getCell(0).getStringCellValue();
	    	System.out.println("Test data from excel :"+data0);
	    }*/
		wb.close();

	}

}
