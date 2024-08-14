package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_175_Print_Count_Dropdown 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(e1);
	//s1.selectByVisibleText("Books");
	//s1.selectByValue("search-alias=appliances");
	List<WebElement> e2= s1.getOptions();
	System.out.println(e2.size());
	for(int i=0;i<e2.size();i++)
	{
		WebElement e3= e2.get(i);
		System.out.println(e3.getText());
		//System.out.println(e3.getAttribute("href"));
	}
	}

}
