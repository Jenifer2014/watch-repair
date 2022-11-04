package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby_pixcel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.lambdatest.com/");
	       driver.manage().window().maximize();
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       
	       js.executeScript("window.scrollBy(0,5000)");

	}

}
