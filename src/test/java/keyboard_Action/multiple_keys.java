package keyboard_Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiple_keys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://text-compare.com/");
		  driver.manage().window().maximize();
		  
		 WebElement input1= driver.findElementById("inputText1");
		 WebElement input2= driver.findElementById("inputText2");
		 
		 Actions act=new Actions(driver);
		 
		 input1.sendKeys("Welcome to Bangalore");
		 //ctrl+a
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 //ctrl+c
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("c");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 //tab
		 act.sendKeys(Keys.TAB);
		 act.perform();
		 
		 //crtl+v
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("v");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
	}

}
