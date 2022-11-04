package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class local_excel {
	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream("D:\\selenium\\Excel\\logindetails.xlsx");
	XSSFWorkbook wbook=new XSSFWorkbook(file);
	XSSFSheet sheet=wbook.getSheetAt(0);

	for (int i = 1; i <= 2; i++) {
		XSSFRow row = sheet.getRow(i);
	for (int j = 0; j < 2; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	}
	
	wbook.close();
}
}