package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://letcode.in/frame");
		  driver.manage().window().maximize();
		  //framework
		  driver.switchTo().frame("firstFr");
		  driver.findElementByName("fname").sendKeys("Jeni");
		  driver.findElementByName("lname").sendKeys("Jayaraj");
		  //2nd framework
		  WebElement myframe =driver.findElementByXPath("//iframe[@src='innerFrame']");
		  driver.switchTo().frame(myframe);
		  driver.findElementByName("email").sendKeys("jeniferjayaraj");
		  driver.switchTo().parentFrame();
		  driver.findElementByName("lname").sendKeys("Jayaraj Jeni");
		  //to come mainpage
		  driver.switchTo().defaultContent();
		  driver.findElementByXPath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a").click();
	}

}
