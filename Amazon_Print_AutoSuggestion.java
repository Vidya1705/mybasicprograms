package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Print_AutoSuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("Shoes");
    Thread.sleep(2000);
    List<WebElement> e1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    for(int i=0;i<e1.size();i++)
    {
    WebElement e2= e1.get(i);
    System.out.println(e2.getText());
    }
	
	
	}

}
