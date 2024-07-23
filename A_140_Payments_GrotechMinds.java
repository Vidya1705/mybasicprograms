package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_140_Payments_GrotechMinds 
{
public static void main(String[] args) 
{
       ChromeDriver driver= new ChromeDriver();
       driver.get("https://www.grotechminds.com/payments/");
       driver.manage().window().maximize();
       WebElement cardnumber= driver.findElement(By.xpath("//input)[@id=cardNumber"));
       cardnumber.sendKeys("123456789");
       WebElement expirydate= driver.findElement(By.xpath("//input)[@id=expiryDate"));
       expirydate.sendKeys("0720");
       WebElement cvv= driver.findElement(By.xpath("//input)[@id=cvv"));
       cvv.sendKeys("000");
       WebElement amount= driver.findElement(By.xpath("//input)[@name=amount"));
       amount.sendKeys("456789");
       
       
       
             
       
	
	
	
	
	
	
	}

}
