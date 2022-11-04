package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshort {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.leafground.com/pages/Dropdown.html");
		  //snap fullscreen
		  File scr=driver.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./snaps/image4.png");
		  FileHandler.copy(scr, dest);
		  //particular button
		 WebElement ele= driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		 File elescr=ele.getScreenshotAs(OutputType.FILE);
		  File eledest=new File("./snaps/image6.png");
		  FileHandler.copy(elescr, eledest);
		  //section 
		  
		 WebElement sec= driver.findElementByClassName("innerblock");
		 File secscr=sec.getScreenshotAs(OutputType.FILE);
		  File secdest=new File("./snaps/image7.png");
		  FileHandler.copy(secscr, secdest);
		  
	}

}
