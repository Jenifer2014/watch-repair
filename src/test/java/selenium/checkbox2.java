package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/checkbox.html");
	    
	    WebElement click1=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/input[4]");
	    click1.click();
	    
	    
	    WebElement click2=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/input[1]");
	    click2.click();
	    
	    WebElement unclick=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/input");
	  boolean selectselenium=unclick.isSelected();
	  System.out.println(selectselenium);
	  
	
	  WebElement uncheck=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/input[1]");
	    
	    if(uncheck.isSelected())
	    {
	    	uncheck.click();
	    }
	    
	    WebElement check=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/input[2]");
	    check.click();
	    if(check.isSelected())
	    {
	    check.click();
	    }
	}

}
