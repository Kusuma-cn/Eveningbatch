package com.sellabs;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataHandling 
{
	
	@Test
	public void fetchdata() throws IOException , BiffException
	{
		
	Workbook wb	= Workbook.getWorkbook(new File(System.getProperty("user.dir") + "\\data.xls"));
	Sheet sh = wb.getSheet("Sheet1");
	int rows = sh.getRows(); 
	int colmns = sh.getColumns();
	String data[] [] = new String [rows] [colmns];
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < colmns; j++) {
			Cell c = sh.getCell(j,i);
		data [i] [j] = c.getContents();
		System.out.print(data [i] [j]+"\t");
			
		}
		
	}
  System.out.println("\n");		
		
			}

}
