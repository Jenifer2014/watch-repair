package downloadfile;

import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		//from desktop
		//driver.findElementById("uploadfile").sendKeys("D:\\selenium\\manual_faqs_Imran.docx");
		
		//from project
		
		driver.findElementById("uploadfile").sendKeys("C:\\Users\\jenni\\eclipse-workspace\\project_Maven\\file\\manual_faqs_Imran.docx");
	}

}
