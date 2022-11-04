package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdispay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://letcode.in/edit");
		  driver.manage().window().maximize();
		  
			/*
			 * WebElement isdisplay =driver.findElementByLinkText("Log in"); boolean b=
			 * isdisplay.isDisplayed(); System.out.println("Login button :"+ b);
			 */
		
		WebElement isenabled1=driver.findElementById("noEdit");
		boolean b1=isenabled1.isEnabled();
		System.out.println("Button Status:"+ b1);
		
	
        
		WebElement isenabled2=driver.findElementById("dontwrite");
		boolean b2=isenabled2.isEnabled();
		System.out.println("Button Status:"+ b2);
		
		
		WebElement isselected=driver.findElementByXPath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input");
		boolean b3=isselected.isSelected();
		System.out.println("Button Status:"+ b3);
	}
	

}
