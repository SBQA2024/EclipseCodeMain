package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.ConstantsValues;

public class FetchDatafromExcel {
	
	public static String FetchDatafromExcelsheet(int x,int y) throws IOException {
		
		FileInputStream fl = new FileInputStream(ConstantsValues.stringURL);
		
		XSSFWorkbook wb = new XSSFWorkbook(fl);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		XSSFCell cellvalue = sheet.getRow(x).getCell(y);
		
		String URL = cellvalue.toString();
		
		return URL;
		
		
		
		
		
		
		
	}

}
