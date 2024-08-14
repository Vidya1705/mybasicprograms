package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_159_HTML_JacascriptPopup 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");	
    driver.switchTo().alert().accept();
    driver.manage().window().maximize();
    WebElement fname=driver.findElement(By.name("fname"));
    fname.sendKeys("Vidya");
	}

}
