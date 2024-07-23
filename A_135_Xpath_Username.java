package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_135_Xpath_Username
{
public static void main(String[] args) throws InterruptedException 
{
     ChromeDriver driver= new ChromeDriver();
     driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");
	driver.manage().window().maximize();
	
	WebElement UN= driver.findElement(By.xpath("(/html/body/input)[1]"));//UN
	UN.sendKeys("Vidya");
	//Thread.sleep(3000);
	WebElement Hint= driver.findElement(By.xpath("(/html/body/input)[2]"));//Hint
	Hint.sendKeys("My Pet's name");
	//Thread.sleep(3000);
	WebElement PW= driver.findElement(By.xpath("(/html/body/input)[3]"));//PW
	PW.sendKeys("Vids@123");
	//Thread.sleep(3000);
	WebElement FN= driver.findElement(By.xpath("(/html/body/form/input)[1]"));//FN
	FN.sendKeys("Vidya");
	//Thread.sleep(3000);
	//WebElement LN= driver.findElement(By.xpath("(/html/body/form/input)[2]"));//LN
	//LN.sendKeys("A");
	//Thread.sleep(3000);
	WebElement Boy= driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));//Boy
	Boy.click();
	WebElement Girl= driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));//Girl
	Girl.click();
	WebElement Baby= driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));//Baby
	Baby.click();
	WebElement Submit= driver.findElement(By.xpath("((/html/body/form[2])/input[4]"));//Submit
	Submit.click();
	WebElement know =driver.findElement(By.linkText("Click to know about us"));
	know.click();

	
	
	
	
	}

}
