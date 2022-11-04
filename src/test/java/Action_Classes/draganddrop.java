package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  
		  WebElement from=driver.findElementById("box5");
		  WebElement to=driver.findElementById("box107");
		  
		  Actions act=new Actions(driver);
		  
		 // act.clickAndHold(from).moveToElement(to).release().build().perform();
		  act.dragAndDrop(from, to).build().perform();
		  

	}

}
