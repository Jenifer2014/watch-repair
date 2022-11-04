package pavan1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.bangaloretrainingacademy.com");
	    System.out.println("Page title:- "+driver.getTitle());
		

	}

}
