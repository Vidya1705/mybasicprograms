package BasicsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_129_Titleofthe_Page 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	
	
	
	
	}

}
