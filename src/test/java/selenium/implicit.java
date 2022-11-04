package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://letcode.in/signin");
		
		WebElement email=driver.findElementByName("email");
		email.clear();
		email.sendKeys("jeniferjayaraj12345@gmail.com");
		
		WebElement pass=driver.findElementByName("password");
		pass.clear();
		pass.sendKeys("jeni@1991");
		driver.findElementByXPath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button").click();
	}

}
