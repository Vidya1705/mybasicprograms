package BasicsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_150_Navigation_Methods 
{
public static void main(String[] args)
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.navigate().to("https://www.google.com");
    driver.manage().window().maximize();
    driver.navigate().back() ;   
    driver.navigate().forward();    
    driver.navigate().refresh();
    
    
    
	}

}
