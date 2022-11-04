package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class active_element {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("// https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		 WebElement active= driver.switchTo().activeElement();
		 active.sendKeys("email",
				 Keys.TAB ,"password",Keys.ENTER);

	}

}
