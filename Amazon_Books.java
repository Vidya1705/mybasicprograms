package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Books
{
public static void main(String[] args) 
{

	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(e1);
	//s1.selectByVisibleText("Books");
	
	//Appliances by its value
//	s1.selectByValue("search-alias=appliances");
		s1.selectByIndex(1);
	
	
	
	}

}
