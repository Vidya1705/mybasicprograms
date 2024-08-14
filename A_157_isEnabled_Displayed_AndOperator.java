package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_157_isEnabled_Displayed_AndOperator
{     
	static boolean b1;
public static void main(String[] args)
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.linkText("Gmail"));	
	if(b1==(e1.isDisplayed()&& b1==e1.isEnabled()))
	{
		e1.click();
	}
	}

}
