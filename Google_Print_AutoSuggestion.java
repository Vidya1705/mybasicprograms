package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Print_AutoSuggestion 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    WebElement search= driver.findElement(By.name("q"));
    search.sendKeys("India");
    List <WebElement> auto= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
    for (int i=0;i<auto.size();i++)
    {
    WebElement e1= auto.get(i);
    System.out.println(e1.getText());
    }
	
	
	
	}

}
