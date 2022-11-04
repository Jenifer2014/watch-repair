package selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel1 {
	public static void main(String[] args) throws IOException {
		String Filelocation="D:\\selenium\\Jenifer123.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(Filelocation);
		XSSFSheet sheet=wbook.getSheetAt(0);
	
		for (int i = 1; i <= 10; i++) {
			XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < 3; j++) {
			XSSFCell cell = row.getCell(j);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		}
		
		wbook.close();
	}

}
