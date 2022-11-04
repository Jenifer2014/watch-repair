package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	public static void main(String[] args) throws InterruptedException {
		String month="March 2023";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		
		driver.findElementByName("checkin").click();
		
		while(true)
		{
		String table=driver.findElementByXPath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]").getText();
		
		if(table.equals(month))
		{
			break;
		}
		else
		{
			driver.findElementByXPath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i").click();
		}
		
	    }
		
		driver.findElementByXPath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]").click();
	}
	
}
