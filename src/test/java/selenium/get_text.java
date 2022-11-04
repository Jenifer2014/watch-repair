package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://letcode.in/edit");
		  driver.manage().window().maximize();
		  
		 WebElement text= driver.findElementByXPath("/html/body/app-root/app-input/section[1]/div/div/div[1]/div/div/div[1]/label");
         String tt=text.getText();
         System.out.println(tt);
         
         WebElement text1= driver.findElementByXPath("/html/body/app-root/app-input/app-pageheader/section/div/div/h1");
         String tt1=text1.getText();
         System.out.println(tt1);
        
         
         WebElement text2= driver.findElementByXPath(" /html/body/app-root/app-input/section[1]/div/div/div[1]/div/div");
         String tt2=text2.getText();
         System.out.println(tt2);
         //get attribute
         String text3= driver.findElementById("join")
        .getAttribute("id");
         System.out.println(text3);
         
         String text4= driver.findElementById("join")
        	        .getAttribute("value");
        	         System.out.println(text4);
        	         
        	         
        	         
        	         WebElement text8= driver.findElementById("fullName");
        	         String tt8=text8.getAttribute("placeholder");
        	         System.out.println(tt8);         
	}

}
