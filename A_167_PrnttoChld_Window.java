package BasicsSelenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A_167_PrnttoChld_Window {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		WebElement shoe_45=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[45]"));
		shoe_45.click();
	    Set<String> ids= driver.getWindowHandles();//parent child id
	    Iterator<String> id= ids.iterator();
	    String parentid= id.next();
	    String childid= id.next();
	    Thread.sleep(5000);
	    //driver.close();
	    driver.switchTo().window(childid);// to move the control from Parent id to child id
	    driver.close();
	    
	    
	}

}
