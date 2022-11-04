package pavan1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class get_command {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bangaloretrainingacademy.com/");
		System.out.println("Title of the Page"+driver.getTitle());
		
		System.out.println("Current URl"+driver.getCurrentUrl());
		
	
		WebElement text =driver.findElementByXPath("/html/body/div[3]/section[1]/div/div/div[1]/div/div[2]/a");
		
		String tt=text.getText();
		System.out.println(tt);
		
		driver.findElementByXPath("//*[@id=\"primary-menu\"]/ul/li[2]/a").click();
		
		driver.close();
	}

}
