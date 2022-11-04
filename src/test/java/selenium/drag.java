package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/drop.html");
		  driver.manage().window().maximize();
		  
		  WebElement drag=driver.findElementById("draggable");

		  WebElement drop=driver.findElementById("droppable");
		  Actions act=new Actions(driver);
		  act.dragAndDrop(drag, drop).build().perform();

	}

}
