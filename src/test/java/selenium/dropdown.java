package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
	    driver.get("https://itera-qa.azurewebsites.net/home/automation");
	    
	  WebElement dropdowm=driver.findElementByXPath("/html/body/div/div[4]/div[2]/div/select");
	  Select select=new Select(dropdowm);
	 select.selectByValue("3");
	  select.selectByVisibleText("Sweden");
     
	  List<WebElement>listofoptions=select.getOptions();
	 int size= listofoptions.size();
	 System.out.println(size);
	 
	 driver.close();
	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
	  ChromeDriver driver1=new ChromeDriver();
	 driver1.get("http://www.leafground.com/pages/Dropdown.html");
	 
	//visible
	 WebElement dropdown=driver1.findElementByXPath("/html/body/div/div[4]/div[2]/div/select");
	  Select select1=new Select(dropdown);
	  select1.selectByVisibleText("Appium");
	  
	 //value
	  WebElement dropdown1=driver1.findElementByName("dropdown2");
	 select1.selectByValue("3");
	 
	 WebElement list=driver1.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/select");
	 List <WebElement>list1=select1.getOptions();
	 int size1=list1.size();
	 System.out.println(size1);
	 
	WebElement sendvalues= driver1.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
	sendvalues.sendKeys("Loadrunner");
	}

}
