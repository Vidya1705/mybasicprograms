package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_162_Google_Auto_suggest
{
public static void main(String[] args) 
{
           ChromeDriver driver= new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       WebElement search= driver.findElement(By.name("q"));
	       search.sendKeys("India");
	       List <WebElement> auto= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	       int count= auto.size();
	       System.out.println(count);
	       auto.get(count-10).click(); //count=10
	
	
	
	}

}
