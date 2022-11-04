package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class top_of_page {

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
		  Actions act=new Actions(driver);
		  WebElement admin=driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
		  WebElement usermg=driver.findElementByXPath("//*[@id=\"menu_admin_UserManagement\"]");
		  WebElement user=driver.findElementByXPath("//*[@id=\"menu_admin_viewSystemUsers\"]");
		  
		  act.moveToElement(admin).moveToElement(usermg).moveToElement(user).click().build().perform();
		  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	}

}
