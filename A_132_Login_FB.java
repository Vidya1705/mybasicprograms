package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_132_Login_FB 
{
public static void main(String[] args) 
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement username= driver.findElement(By.id("email"));
	username.sendKeys("vidya1985@gmail.com");
	WebElement password= driver.findElement(By.id("pass"));
	password.sendKeys("Vids@123");
	WebElement loginbutton= driver.findElement(By.name("login"));
	//loginbutton.click();
	loginbutton.sendKeys(Keys.ENTER);
	
	
	
	}

}
