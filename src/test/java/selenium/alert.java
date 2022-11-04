package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/Alert.html");
		  //Alert
		  WebElement alertbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button");
		  alertbox.click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept();
		  
		  //confirm alert cancel
		  WebElement confirmbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
		  confirmbox.click();
		  Alert confirmalert=driver.switchTo().alert();
		  confirmalert.dismiss();
		  
		  //confirm alertok
		  WebElement confirmbox1=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
		  confirmbox1.click();
		  Alert confirmalert1=driver.switchTo().alert();
		  confirmalert1.accept();
		  
		  //prompt box
		  WebElement promptbox=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button");
		  promptbox.click();
		  Alert promptalert=driver.switchTo().alert();
		  promptalert.sendKeys("Jenifer");
		  promptalert.accept();

	}

}
