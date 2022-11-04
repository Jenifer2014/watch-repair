package selenium_practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		WebElement textbox=driver.findElementById("fullName");
		textbox.sendKeys("Jenifer");
		
		WebElement textbox1=driver.findElementById("join");
		textbox1.sendKeys(" Jenifer");
		String tt=textbox1.getAttribute("value");
		System.out.println(tt);
		
		String ti=driver.findElementById("getMe").getAttribute("value");
		System.out.println(ti);
		
		driver.findElementById("clearMe").clear();
		
		WebElement disable=driver.findElementById("noEdit");
		boolean b1=disable.isEnabled();
		System.out.println(b1);
		
		
       driver.findElementById("dontwrite").sendKeys("Jeni");
	}

}
