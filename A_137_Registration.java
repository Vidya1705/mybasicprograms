package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_137_Registration 
{
public static void main(String[] args) 
{
         ChromeDriver driver= new ChromeDriver();
         driver.get("https://www.grotechminds.com/registeration-form/");
         driver.manage().window().maximize();
         WebElement first_name=  driver.findElement(By.name("firstName"));
         first_name.sendKeys("Vidya");
         WebElement last_name=  driver.findElement(By.name("lastName"));
         last_name.sendKeys("A");
         WebElement email=  driver.findElement(By.name("email"));
         email.sendKeys("Vidya1985@gmail.com");
         WebElement phone_no=   driver.findElement(By.id("phone"));
         phone_no.sendKeys("1234567890");
         WebElement Aadhar=   driver.findElement(By.id("aadhaar"));
         Aadhar.sendKeys("987456321245");
         WebElement PAN=   driver.findElement(By.name("pan"));
         PAN.sendKeys("AWEON11345");
         WebElement Register=   driver.findElement(By.name("Submit"));
         Register.click();
         
         
         
         
	
	
	
	}

}
