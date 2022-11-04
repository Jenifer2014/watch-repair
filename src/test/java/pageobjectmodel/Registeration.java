package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registeration {

		WebDriver driver;
    
		By reglink=By.linkText("REGISTER");
		By firstname=By.name("firstName");
		By lastname=By.name("lastName");
		By contact =By.name("phone");
		By email=By.id("userName");
		By address=By.name("address1");
		By city=By.name("city");
		By state=By.name("state");
		By postalcode=By.name("postalCode");
		By country=By.name("country");
		By uname=By.id("email");
		By upassword=By.name("password");
		By Cpassword=By.name("confirmPassword");
		By submit=By.name("submit");
		public Registeration(WebDriver driver)
		{
			this.driver=driver;
		}
		
		public void reglink1()
		{
			WebElement regbox=driver.findElement(reglink);
			regbox.click();
		}
		
		public void Fname(String fname)
		{
			WebElement namef=driver.findElement(firstname);
			namef.sendKeys(fname);
		}
		
		public void Lname(String lname)
		{
			WebElement namel=driver.findElement(lastname);
			namel.sendKeys(lname);
		}
		
		public void Contact(String cont)
		{
			WebElement contactno=driver.findElement(contact);
			contactno.sendKeys(cont);
		}
		
		public void Email(String mail)
		{
			WebElement mailbox=driver.findElement(email);
			mailbox.sendKeys(mail);
		}
		
		public void Address(String address1)
		{
			WebElement addressbox=driver.findElement(address);
			addressbox.sendKeys(address1);
		}
		
		public void City(String cit)
		{
			WebElement citybox=driver.findElement(city);
			citybox.sendKeys(cit);
		}
		
		public void State(String state1)
		{
			WebElement statebox=driver.findElement(state);
			statebox.sendKeys(state1);
		}
		
		public void Pcode(String pincode)
		{
			WebElement pcodebox=driver.findElement(postalcode);
			pcodebox.sendKeys(pincode);
		}
		
		public void Country(String CC)
		{
			WebElement countrybox=driver.findElement(country);
			countrybox.sendKeys(CC);
		}
		
		public void Username(String username)
		{
			WebElement unamebox=driver.findElement(uname);
			unamebox.sendKeys(username);
		}
		
		public void password1(String pp1)
		{
			WebElement passwordbox=driver.findElement(upassword);
			passwordbox.sendKeys(pp1);
		}
		
		public void password2(String pp2)
		{
			WebElement passwordbox2=driver.findElement(Cpassword);
			passwordbox2.sendKeys(pp2);
		}
		
		public void submit1()
		{
			WebElement submitbox=driver.findElement(submit);
			submitbox.click();
		}
		
	}



