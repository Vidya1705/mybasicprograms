package BasicsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_127_Close_Quit 
{
public static void main(String[] args) 
{
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();
         //driver.close();
         driver.quit();
	
	
	
	
	
	
	
	}

}
