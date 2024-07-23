package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Dblclick {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       //WebElement gmail_link= driver.findElement(By.linkText("Gmail"));
	       WebElement gmail_link= driver.findElement(By.partialLinkText("Gma"));

	       Actions a1=new Actions(driver);
	       a1.doubleClick(gmail_link).perform();
	}

}
