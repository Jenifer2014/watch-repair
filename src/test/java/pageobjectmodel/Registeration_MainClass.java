package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Registeration_MainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\Chromedriver_103\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		
		  Registeration RGP=new Registeration(driver);
		  
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  
		RGP.reglink1();
		RGP.Fname("Jenifer");
		RGP.Lname("Jayaraj");
		RGP.Contact("9742410330") ;
		RGP.Email("jeniferjayaraj12345");
		RGP.Address("Maruthinagar");
		RGP.City("Bangalore");
		RGP.State("Karnataka");
		RGP.Pcode("560068");
		RGP.Country("India");
		RGP.Username("Jenifer123");
		RGP.password1("jeni@123");
		RGP.password2("jeni@123");
		RGP.submit1();
		  
		  driver.close();

	}

}
