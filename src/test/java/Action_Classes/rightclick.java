package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		  driver.manage().window().maximize();
		  
		  Actions act= new Actions(driver);
		  
		WebElement button=  driver.findElementByXPath("/html/body/div/section/div/div/div/p/span");
		  act.contextClick(button).build().perform();
		  
		 WebElement copy=driver.findElementByXPath("/html/body/ul/li[3]/span");
		 copy.click();
		 
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();

		  

	}

}
