package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_134_Amazon_Custservice_Mobiles 
{
public static void main(String[] args) 
{
      ChromeDriver driver= new ChromeDriver();
      driver.get("https://www.amazon.in");
      driver.manage().window().maximize();
      //WebElement amazon_customerservice=  driver.findElement(By.linkText("Customer Service"));
      //WebElement amazon_customerservice=  driver.findElement(By.partialLinkText("Customer"));
    //amazon_customerservice.click();
      //WebElement amazon_mobiles=  driver.findElement(By.linkText("Mobiles"));
      WebElement amazon_mobiles=  driver.findElement(By.partialLinkText("iles"));
      amazon_mobiles.click();
       
	
	
	}

}
