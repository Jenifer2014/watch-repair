package pavan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	private static final String XSSXWorkbook  = null;

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("D:\\selenium\\test_emp.xlsx");
		XSSFWorkbook wbook=new XSSFWorkbook(file);
		XSSFSheet sheet=wbook.getSheetAt(1);
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		System.out.println(cell);
		
		

	}


}
