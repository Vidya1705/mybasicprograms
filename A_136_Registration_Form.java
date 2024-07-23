package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_136_Registration_Form 
{
public static void main(String[] args) 
{
       ChromeDriver driver= new ChromeDriver();
       driver.get("https://grotechminds.com/registration/");	
       driver.manage().window().maximize();
       WebElement first_name=  driver.findElement(By.name("fname"));
       first_name.sendKeys("Vidya");
       WebElement last_name=  driver.findElement(By.name("lname"));
       last_name.sendKeys("A");
       WebElement email=  driver.findElement(By.name("email"));
       email.sendKeys("Vidya1985@gmail.com");
       WebElement password=  driver.findElement(By.name("password"));
       password.sendKeys("Vid@123");
       WebElement Gender=  driver.findElement(By.id("Female"));
       Gender.click();
       WebElement Present_Address=  driver.findElement(By.id("Present-Address"));
       Present_Address.sendKeys("Bangalore");
       WebElement Permanent_Address=  driver.findElement(By.id("Permanent-Address"));
       Permanent_Address.sendKeys("Bangalore");
       WebElement Pincode=  driver.findElement(By.name("Pincode"));
       Pincode.sendKeys("560000");
       WebElement Relocate=  driver.findElement(By.id("relocate"));
       Relocate.click();
       WebElement Submit=  driver.findElement(By.name("Submit"));
       Submit.click();
       
	
	
	
	 
	
	}

}
