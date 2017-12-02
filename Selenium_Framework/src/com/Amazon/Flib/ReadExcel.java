package com.Amazon.Flib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String ReadExcelData(int row,int cell,int Sheet) throws Exception{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Romesh\\Downloads\\ExcelData.xlsx");
		
		XSSFWorkbook xs=new XSSFWorkbook(file);
		
		XSSFSheet sheet=xs.getSheetAt(Sheet);
		String URL=sheet.getRow(row).getCell(cell).getStringCellValue();
		return URL;
	}

}
