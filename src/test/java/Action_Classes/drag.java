package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/drag.html");
	  driver.manage().window().maximize();
	  
	  WebElement drag=driver.findElementById("draggable");

	  Actions act=new Actions(driver);
	 act.dragAndDropBy(drag, 50, 60).build().perform();
}
}