package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		driver.get("https://jqueryui.com/resizable");
		
		Actions act= new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement resize=driver.findElementByXPath("//*[@id=\"resizable\"]/div[3]");
		
		
		act.moveToElement(resize).dragAndDropBy(resize, 100, 150).build().perform();
		Thread.sleep(3000);
	}

}
