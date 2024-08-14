package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_164_Banking 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
    driver.manage().window().maximize();
    WebElement link= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
    link.click();
    WebElement login=driver.findElement(By.name("userName"));
    login.sendKeys("Vidya");
    WebElement PW=driver.findElement(By.name("password"));
    PW.sendKeys("Vidya@123");
	}

}
