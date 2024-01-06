package com.smart.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
	
	
	@DataProvider
	public String[][] loginData() throws IOException{
//	public static void main(String[] args) throws IOException {
	File src = new File("./src/test/resources/ExcelData.xlsx");//create an instance of excel file using file class of java.io package	
//	System.out.println(src.exists());
	
	FileInputStream fis = new FileInputStream(src);//covert the excel file into raw data
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);//create a workbook
	XSSFSheet sheet = wb.getSheet("Sheet1");//from the workbook find out the sheet
	int rows = sheet.getPhysicalNumberOfRows();	//count total rows in the sheet
	int columns = sheet.getRow(0).getLastCellNum();//count columns in the row
	
	
	String[][] data = new String[rows-1][columns];
	
	
	for (int i=0; i < rows; i++) {
		for(int j=0; j < columns; j++) {
			//this class would format ever data type into a string
			DataFormatter formatter = new DataFormatter();
//			System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
//			System.out.println(formatter.formatCellValue(sheet.getRow(i+1).getCell(j)));
			data[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
//		System.out.println();
	}
	
	//closing would prevent memory loss
	wb.close();
	fis.close();
	return data;

	
	}

}
