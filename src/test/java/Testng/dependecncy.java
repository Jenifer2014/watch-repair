package Testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependecncy {
	ChromeDriver driver;
	  @Test (priority=0)
	  public void Home() {
		  WebElement homebt=driver.findElementByXPath("//*[@id=\"menu-item-2246\"]/a/span");
		  homebt.click();
		  WebElement reviewbt=driver.findElementById("my-counter1");
		  boolean b=reviewbt.isDisplayed();
		  if(b)
		  {
			  System.out.println("Successful");
		  }
		  else {
			  System.out.println("Failer");
		  }
	  }
		  @Test (priority=1 ,dependsOnMethods="home")
		  public void about_us() {
		  WebElement aboutusbt=driver.findElementByXPath("//*[@id=\"menu-item-2252\"]/a/span");
		  aboutusbt.click();
		  WebElement submit=driver.findElementByXPath("/html/body/div[8]/div/footer/div/div/div/section[2]/div/div/div[3]/div/div/div/div/aside/div/div/div/div/div[2]/div/div/form/div[1]/div/button");
		  boolean b1=submit.isDisplayed();
		  if(b1)
		  {
			  System.out.println("about us page is Successful");
		  }
		  else {
			  System.out.println(" about us page is Failer");
		  }
		  }
		  @Test (priority=3)
		  public void service() {
		  WebElement servicebt=driver.findElementByXPath("//*[@id=\"menu-item-3744\"]/a/span");
		  servicebt.click();
		  WebElement brand=driver.findElementByXPath("//*[@id=\"post-7358\"]/div/div/div/div/section[8]/div/div/div[2]/div/div/div[1]/div/div/h1/span");
		  boolean b1=brand.isDisplayed();
		  if(b1)
		  {
			  System.out.println("Service page is Successful");
		  }
		  else {
			  System.out.println(" Service page is Failer");
		  }
		  }
		
		  @Test (priority=2 ,dependsOnMethods="about_us")
		  public void blog() {
		  WebElement blogbt=driver.findElementByXPath("//*[@id=\"menu-item-2256\"]/a/span");
		  blogbt.click();
		  WebElement brand=driver.findElementByXPath("//*[@id=\"post-7944\"]/div[1]/a");
		  boolean b1=brand.isDisplayed();
		  if(b1)
		  {
			  System.out.println("blog page is Successful");
		  }
		  else {
			  System.out.println(" blog page is Failer");
		  }
		  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.watchrepairco.com/");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }

}
