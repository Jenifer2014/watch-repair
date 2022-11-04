package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
		  
		  //select any of the option
		 List<WebElement> multiselect= driver.findElementsByXPath("//input[@type='checkbox' and contains(@id,'day')]");
        System.out.println("No of Webelementsize: " + multiselect.size());
       
       /* //for loop
        for(int i=0;i<=multiselect.size();i++)
        {
        	
			multiselect.get(i).click();
        }*/
        //for each loop
		/*
		 * for(WebElement check:multiselect) { check.click();
		 * 
		 * }
		 */
        
		/*
		 * //select mutiple from choice WebElement
		 * thursday=driver.findElementById("thursday"); thursday.click(); WebElement
		 * monday=driver.findElementById("monday"); monday.click();
		 */
        
        //first 3 checkbox
      
		/*
		 * for(int i=0;i<=multiselect.size();i++) { if(i<3) {
		 * multiselect.get(i).click(); } }
		 */
        
        
	}

}
