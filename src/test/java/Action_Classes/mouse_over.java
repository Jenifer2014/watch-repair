package Action_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	
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
		  
		  
		  //mouse over
		  
		  Actions act=new Actions(driver);
		  //step1
			/*
			 * WebElement
			 * admin=driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
			 * act.moveToElement(admin).build().perform();
			 * 
			 * WebElement
			 * usermg=driver.findElementByXPath("//*[@id=\"menu_admin_UserManagement\"]");
			 * act.moveToElement(usermg).build().perform();
			 * 
			 * WebElement
			 * user=driver.findElementByXPath("//*[@id=\"menu_admin_viewSystemUsers\"]");
			 * act.moveToElement(user).click().build().perform();
			 */
		  
		  WebElement admin=driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
		  WebElement usermg=driver.findElementByXPath("//*[@id=\"menu_admin_UserManagement\"]");
		  WebElement user=driver.findElementByXPath("//*[@id=\"menu_admin_viewSystemUsers\"]");
		  //step2
		  act.moveToElement(admin).moveToElement(usermg).moveToElement(user).click().build().perform();
		 WebElement sname =driver.findElementByName("searchSystemUser[userName]");
		  sname.sendKeys("Jenifer");
		  boolean b =driver.findElementByName("searchSystemUser[userName]").isDisplayed();
		  if(b) {
			  System.out.println("Successful");
		  }
		  else {
			  System.out.println("Failed");
		  }
		  
		  driver.close();
		  
		  
		  
		  
		  

	}

}
