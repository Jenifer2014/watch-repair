package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class htmltable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		int rows=driver.findElementsByXPath("//table[@cellspacing='0']/tbody/tr").size();
		System.out.println("No of Rows"+rows);
		
		int col=driver.findElementsByXPath("//table[@cellspacing='0']//tr/th").size();
		System.out.println("No of Rows"+col);
		
		String st=driver.findElementByXPath("//table[@cellspacing]//tr[2]/td[1]").getText();
		System.out.println(st);
		
		String st1=driver.findElementByXPath("//table[@cellspacing]//tr[3]/td[2]").getText();
		System.out.println(st1);
		  
		
		driver.findElementByXPath("//table[@cellspacing]//tr[3]/td[3]").click();
		
		System.out.println("Table data value");
		 for(int r=0;r<=rows;r++)
		 {
			 for(int c=0;c<=col;c++)
			 {
				 String data=driver.findElementByXPath("//table[@cellspacing]//tr["+r+"]/td["+c+"]").getText();
				 System.out.print(data);
			 }
			 System.out.println();
		 }

	}

}
