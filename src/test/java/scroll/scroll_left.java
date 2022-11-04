package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_left {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.album.alexflueras.ro/index.php");
	       driver.manage().window().maximize();
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       
	      
	       
	       js.executeScript("window.scrollBy(-5000,0)");
	       Thread.sleep(3000);

	}

}
