package keyboard_Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/key_presses?");
		  driver.manage().window().maximize();
     
		  
		  
		  Actions act=new Actions(driver);
		  
		  act.sendKeys(Keys.ENTER).perform();
		  Thread.sleep(3000);
		  act.sendKeys(Keys.ARROW_DOWN).perform();
		  Thread.sleep(3000);
		  act.sendKeys(Keys.ARROW_LEFT).perform();
		  Thread.sleep(3000);
	}

}
