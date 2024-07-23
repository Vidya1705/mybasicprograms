package BasicsSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL 
{
public static void main(String[] args) throws InterruptedException 
{

	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(5000);// let the browser sleep for 5sec
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();//minimize the screen
	driver.manage().window().maximize();//maximize the screen
	Thread.sleep(2000);
	//driver.close();
	//driver.quit();
	//System.out.println(driver.getWindowHandle());//will give the browser id
	//System.out.println(driver.getWindowHandles());
	

	
	
	}

}
