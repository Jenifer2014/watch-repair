package pavan1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readecelvaluesforform {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bangaloretrainingacademy.com/contact.html");
		
		
	FileInputStream file=new FileInputStream("D:\\selenium\\sampletest.xlsx");//reading location
	XSSFWorkbook wbook=new XSSFWorkbook(file);//folder
	XSSFSheet sheet=wbook.getSheet("Sheet2");//sheet
	
	int rowcount =sheet.getLastRowNum();
	int colcount=sheet.getRow(0).getLastCellNum();
	
	for(int row=1;row<rowcount;row++)
	{
		XSSFRow currentrow=sheet.getRow(row);
		
		String Name=currentrow.getCell(0).getStringCellValue();
		int Contact_No=(int) currentrow.getCell(1).getNumericCellValue();
		String Email=currentrow.getCell(1).getStringCellValue();
		String Course=currentrow.getCell(2).getStringCellValue();
		String Feedback=currentrow.getCell(3).getStringCellValue();
		
		WebElement name=driver.findElementById("name");
		name.sendKeys(Name);
		
		WebElement C_No=driver.findElementById("mobile");
		C_No.sendKeys(String.valueOf(Contact_No));
		
		WebElement email=driver.findElementById("email");
		email.sendKeys(Email);
		
		WebElement course=driver.findElementById("course");
		course.sendKeys(Course);
		
		WebElement feedback=driver.findElementById("msg");
		feedback.sendKeys(Feedback);
		
		
		
	}

}
}