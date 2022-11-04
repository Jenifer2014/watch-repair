package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/upload.html");
		  
		WebElement file=  driver.findElementByName("filename");
         file.sendKeys("D:\\selenium\\manual_faqs_Imran.docx");
         
         boolean b=file.isDisplayed();
         if(b)
         {
        	 
        	 System.out.println("Upload Successful");
         }
         else
         {
        	 System.out.println("Upload Failed");
         }
	}

}
