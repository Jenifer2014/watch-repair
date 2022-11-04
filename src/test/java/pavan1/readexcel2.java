package pavan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("D:\\selenium\\sampletest.xlsx");//reading location
		XSSFWorkbook wbook=new XSSFWorkbook(file);//folder
		XSSFSheet sheet=wbook.getSheet("Sheet1");//sheet
		int row=sheet.getLastRowNum();//row count
		System.out.println(row);
		int col=sheet.getRow(0).getLastCellNum();//col count
		System.out.println(col);
		for(int i=0;i<row;i++)//read all the row
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<col;j++)//read all the cell
			{
				String value=currentrow.getCell(j).toString();
				
				System.out.print( "  "+value);
			}
			System.out.println(  );
		}
		
		
}
}