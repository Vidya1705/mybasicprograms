package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_131_Amazon_Shoes_Enter 
{
public static void main(String[] args)
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

	
	
	}

}
