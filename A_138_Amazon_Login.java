package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_138_Amazon_Login 
{
public static void main(String[] args) 
{

	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dshoes%26crid%3D2E0PNQJAVM7N1%26sprefix%3D%252Caps%252C251%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement email=driver.findElement(By.xpath("(//input)[7]"));
	email.sendKeys("Vidya1985@gmail.com");
	WebElement cont=driver.findElement(By.xpath("(//input)[10]"));
	cont.click();	
	WebElement PW=driver.findElement(By.xpath("(//input)[9]"));
	PW.sendKeys("gmail123");
	WebElement signin=driver.findElement(By.xpath("(//input)[10]"));
	signin.click();
	           







}

}
