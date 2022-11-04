package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip_date {

	public static void main(String[] args) {
		String month="Mar 2023";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElementByXPath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]").click();
		
		

	}

}
