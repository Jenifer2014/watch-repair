package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		driver.get("https://jqueryui.com/slider");
		
		Actions act= new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement drag=driver.findElementById("slider");
		
       act.moveToElement(drag).dragAndDropBy(drag, 300, 0).build().perform();
       
       
       
	}

}

