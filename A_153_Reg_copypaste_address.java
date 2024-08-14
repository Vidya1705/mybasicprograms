package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_153_Reg_copypaste_address 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://grotechminds.com/registration/");	
    driver.manage().window().maximize();
    WebElement present=driver.findElement(By.id("Present-Address"));
    present.sendKeys("Bangalore Karnataka");
    present.sendKeys(Keys.CONTROL+"a");
    present.sendKeys(Keys.CONTROL+"C");
    WebElement permanent=driver.findElement(By.id("Permanent-Address"));
    permanent.sendKeys(Keys.CONTROL+"V");
    
	
	
	
	
	
	
	}

}
