package pavan1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread1 {


		public static void main(String[] args) throws IOException {
			
			FileInputStream file=new FileInputStream("D:\\selenium\\test_emp.xlsx");
			XSSFWorkbook wbook=new XSSFWorkbook(file);
			XSSFSheet sheet=wbook.getSheetAt(1);
			int row=sheet.getLastRowNum();
			int cell=sheet.getRow(1).getLastCellNum();
			
			for(int i=0;i<row;i++)
			{
				XSSFRow currentrow=sheet.getRow(i);//Forced on current row
				for(int j=0;j<cell;j++)
				{
					String value=currentrow.getCell(j).toString();
					System.out.print("    "+value);
					
				}
				System.out.println( );
			}
	}

}
