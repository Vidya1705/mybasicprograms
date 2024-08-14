package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_141_Absolute_Relative 
{
	public static void main(String[] args)
	{

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement Fname= driver.findElement(By.xpath("(//input)[@id='FirstName']"));
		Fname.sendKeys("Vidya");
		WebElement Lname= driver.findElement(By.xpath("(//input)[@id='LastName']"));
		Lname.sendKeys("A");
		WebElement Mname= driver.findElement(By.xpath("(//input)[@id='MiddleName']"));
		Mname.sendKeys("Vids");
		WebElement workplace= driver.findElement(By.xpath("(//input)[@id='Work-Place-Address]"));
		workplace.sendKeys("Bangalore");
		WebElement homeaddress= driver.findElement(By.xpath("(//input)[@id='home-address']"));
		homeaddress.sendKeys("Bangalore");
		WebElement email1= driver.findElement(By.xpath("(//input)[@id='Personal-Email']"));
		email1.sendKeys("vidya1985@gmail.com");
		WebElement email2= driver.findElement(By.xpath("(//input)[@id='Corporate-email']"));
		email2.sendKeys("vidya1985@gmail.com");
		WebElement mobile= driver.findElement(By.xpath("(//input)[@id='tel']"));
		mobile.sendKeys("123456789");
		WebElement submit= driver.findElement(By.xpath("(//button)[@class='btn btn-primary']"));
		submit.click();		
		
		
		
		
	}

}
