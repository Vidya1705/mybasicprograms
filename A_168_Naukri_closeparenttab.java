package BasicsSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_168_Naukri_closeparenttab 
{
public static void main(String[] args) 
	{
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.manage().window().maximize();
        
        WebElement naukri= driver.findElement(By.xpath("//span[.='Google']"));
        naukri.click();
        
        Set<String> ids=driver.getWindowHandles(); //convert 2 ids into sing string 
        Iterator<String>id =ids.iterator();
        
        String parentid= id.next(); //Method of iterator
        String childid= id.next();
        driver.switchTo().window(childid);
        driver.close();
	
	}

}
