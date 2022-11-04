package pavan1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		
		WebElement fnamebox=driver.findElementByName("firstname");
		WebElement lnamebox=driver.findElementByName("lastname");
		
		if(fnamebox.isDisplayed() && fnamebox.isEnabled())
		{
		
			fnamebox.sendKeys("Jenifer");
		}
		if(lnamebox.isDisplayed() && lnamebox.isEnabled())
		{
		
			lnamebox.sendKeys("Jayaraj");
		}
		
	   WebElement gender=driver.findElementByXPath("//*[@id=\"u_0_o_du\"]/span[1]/label");
	   gender.isSelected();
	   WebElement gender1=driver.findElementByXPath("//*[@id=\"u_0_o_du\"]/span[2]/label");
	 gender1.isSelected();
	  
	
	}

}
