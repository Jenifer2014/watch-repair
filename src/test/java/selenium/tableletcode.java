package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class tableletcode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		int rows=driver.findElementsByXPath("//table[@id='simpletable']/tbody/tr").size();
        System.out.println(rows);
        
        int cols=driver.findElementsByXPath("//table[@class='table is-fullwidth is-bordered']/thead/tr/th").size();
        System.out.println(cols);
        
        String table=driver.findElementByXPath("//table[@id='simpletable']//tr[1]/td[2]").getText();
        System.out.println(table);
        
        String table1=driver.findElementByXPath("//table[@id='simpletable']//tr[1]/td[3]").getText();
        System.out.println(table1);
        
        String table2=driver.findElementByXPath("//table[@id='simpletable']//tr[1]/td[1]").getText();
        System.out.println(table2);
        
        String table4=driver.findElementByXPath("//table[@id='simpletable']//tr[1]/td[4]").getText();
        
        for(int r=1;r<=rows;r++)
        {
        	for(int c=1;c<=cols;c++)
        	{
        		
        		String values=driver.findElementByXPath("//table[@id='simpletable']//tr["+r+"]/td["+c+"]").getText();
        		System.out.print("  "+values+ " ");
        	}
        	System.out.println(  );
        }
	}

}
