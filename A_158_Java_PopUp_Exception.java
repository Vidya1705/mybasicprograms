package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_158_Java_PopUp_Exception
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://grotechminds.com/javascript-popup/");	
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.xpath("//button[.='Click ']"));
    e1.click();
    driver.switchTo().alert().accept();
    //e1.click();
	
	
	
	}

}
