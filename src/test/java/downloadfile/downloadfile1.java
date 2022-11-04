package downloadfile;

import org.openqa.selenium.chrome.ChromeDriver;

public class downloadfile1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\drivers\\\\Chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		
		driver.findElementById("textbox").sendKeys("Test download");
		driver.findElementById("createTxt").click();
		driver.findElementById("link-to-download").click();
		
		driver.findElementById("pdfbox").sendKeys("Test pdf download");
		driver.findElementById("createPdf").click();
		driver.findElementById("pdf-link-to-download").click();
		

	}

}
