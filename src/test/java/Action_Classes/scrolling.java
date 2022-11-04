package Action_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.nationsonline.org/oneworld/countries_of_the_world.htm");
		  
		  JavascriptExecutor js=(  JavascriptExecutor)driver;
		  //scrolling by pixcel
		 //js.executeScript("window.scrollBy(0,8000)","");
		  
		 //scrolling by reaching thr element
		  
		//WebElement flag=driver.findElementById("IND");
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		
		//scroll the page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
