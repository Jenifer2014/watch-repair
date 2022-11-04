package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_bottomofthe_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com");
		  driver.manage().window().maximize();
		  //Login page
		  WebElement uname=driver.findElementByName("txtUsername");
		  uname.sendKeys("Admin");
		  WebElement upassword=driver.findElementByName("txtPassword");
		  upassword.sendKeys("admin123");
		  WebElement lgbt=driver.findElementByName("Submit");
		  lgbt.click();
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
