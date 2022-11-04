package project_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32_101 Version\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in");
		  Actions act= new Actions(driver);
		  
		  WebElement enter_text=driver.findElementById("twotabsearchtextbox");
		  
		  act.sendKeys(enter_text,"vivi phone").build().perform();
		  
		  WebElement click1=driver.findElementById("nav-search-submit-button");
				  
			act.click(click1).build().perform();  
;
	}

}
