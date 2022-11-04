package project_Maven;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.redbus.in/");
		  driver.manage().window().maximize();
		  
        WebElement from=driver.findElementById("txtSource");
        from.sendKeys("bangalore");
       WebElement list= driver.findElementByXPath("//li[@class='C120_slist-item']//span");
       list.sendKeys(Keys.ARROW_DOWN);
       list.sendKeys(Keys.ENTER);
        
       ;
	}

}
