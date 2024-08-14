package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_147_DragDrop_Rev
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
	      driver.get("https://grotechminds.com/drag-and-drop/");	
	      driver.manage().window().maximize();
	      WebElement droprev= driver.findElement(By.xpath("//div[@id='div2']"));  
	      WebElement dragrev= driver.findElement(By.xpath("//div[@id='container-6']"));
	     
	      Actions a2= new Actions(driver);
	      a2.dragAndDrop(dragrev, droprev).perform();
	      
	}

}
