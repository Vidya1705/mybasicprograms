package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_176_Count_Print_Links
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	List<WebElement> links=     driver.findElements(By.tagName("a"));
	int count= links.size();
	System.out.println(count);
	for(int i=0; i<count;i++)
	{
		WebElement e1=   links.get(i);
		System.out.println(e1.getAttribute("href"));//gives all the links.tag name of is also <a href which gives all the links
		System.out.println(e1.getText());//gives all the link names 
	}
	
	}

}
