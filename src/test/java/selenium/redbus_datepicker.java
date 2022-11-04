package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class redbus_datepicker {

	public static void main(String[] args) throws InterruptedException {
		String month="Mar 2023";
		int day=20;
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElementById("onward_cal").click();
		
		while(true)
		{
			String st=driver.findElementByXPath("//td[@class='monthTitle']").getText();
			if(st.equals(month))
			{
				break;
			}
			else
			{
				driver.findElementByXPath("//button[normalize-space()='>']").click();
			}
		}
		   driver.findElementByXPath("//body[1]/div[4]/table[1]/tbody[1]/tr/td[contains(text(),'20')]").click();
	}

}
