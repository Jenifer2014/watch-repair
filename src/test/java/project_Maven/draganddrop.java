package project_Maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32_101 Version\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("http://www.leafground.com/pages/drop.html");
		  
		 WebElement from= driver.findElementById("draggable");
		 
		WebElement to= driver.findElementById("droppable");
		
		  Actions act = new Actions(driver); 
		  
		  act.dragAndDrop(from, to).build().perform();
		  
		  
		  

	}

}
