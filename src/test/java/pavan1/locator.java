package pavan1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		driver.findElementByXPath("//input[@placeholder='Enter first & last name']").sendKeys("Jenifer Jayaraj");
		WebElement text=driver.findElementByXPath("//input[@value='I am good' and @type='text']");
			text.sendKeys("  Jenifer");
			String tt=text.getAttribute("value");
			System.out.println(tt);
			
			WebElement ga=driver.findElementByXPath("//input[@value='ortonikc']");
			String tt1=ga.getAttribute("value");
			System.out.println(tt1);
			
			
				
		

	}

}
