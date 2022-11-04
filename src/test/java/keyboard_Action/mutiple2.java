package keyboard_Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mutiple2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://extendsclass.com/text-compare.html");
	  driver.manage().window().maximize();
	  
		 Actions act=new Actions(driver);
	 WebElement input1= driver.findElementByXPath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[11]/pre");
	 act.keyDown(input1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	 WebElement input2= driver.findElementByXPath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre");
	 act.keyDown(input2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	 
}
	 
	
	 
	 
	
	 

}
