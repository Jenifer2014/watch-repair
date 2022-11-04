package project_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32_101 Version\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.get("https://unixpapa.com/js/testmouse.html");
		  
		  Actions action = new Actions(driver);
		  
          WebElement elem_clear = driver.findElement(By.xpath("//a[.='click here to clear']"));
          Thread.sleep(2000);
          elem_clear.click();

          WebElement elem_test_btn = driver.findElement(By.xpath("//a[.='click here to test']"));
          Thread.sleep(2000);
          action.doubleClick(elem_test_btn).build().perform();

          /* Verify whether the double click operation was successful or not */
          WebElement text_area = driver.findElement(By.cssSelector("textarea"));
          String textattr = text_area.getAttribute("value");
          System.out.println(textattr);
		  

	}

}
