package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("GroTechMinds");
    //driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    WebElement hamburger= driver.findElement(By.xpath("//div[@class='gb_f']"));
    hamburger.click();
    Thread.sleep(2000);
    WebElement YouTube= driver.findElement(By.linkText("YouTube"));
    YouTube.click();
    driver.findElement(By.name("search_query")).sendKeys("GroTechMinds");
    driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    WebElement subscribe=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill'][6]"));
    subscribe.click();
	}

}
