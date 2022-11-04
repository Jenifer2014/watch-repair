package selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel {

	public static void main(String[] args) throws IOException {
		String Filelocation="./test-excel/login.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(Filelocation);
		XSSFSheet sheet=wbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String value=cell.getStringCellValue();
		System.out.println(value);
	
	}

}
