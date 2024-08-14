package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_163_Amazon_Autosuggesion 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("Shoes");
    Thread.sleep(5000);
    List<WebElement> autosuggestion= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    int count=autosuggestion.size();
    autosuggestion.get(count-10).click();//count=10
    System.out.println(count);
	
	
	
	}

}
