package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_190_Amazonshoes_parenttochild 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    Workbook w1= WorkbookFactory.create(f1);
    String UN= w1.getSheet("Login3").getRow(0).getCell(0).getStringCellValue();
    String PW= w1.getSheet("Login3").getRow(0).getCell(1).getStringCellValue();
	
	ChromeDriver driver= new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoes"+Keys.ENTER);
	WebElement shoe3= driver.findElement(By.xpath("(//div[@Class='a-section aok-relative s-image-tall-aspect'])[3]"));
	shoe3.click();
	//System.out.println(driver.getWindowHandle()); //only parent id
	Set<String> ids=driver.getWindowHandles();// both parent and child id
	Iterator<String> id= ids.iterator();
	String parentid= id.next();// parent id
	String childid= id.next();//1st child id
	Thread.sleep(3000);
	driver.switchTo().window(childid); // move control from parent to child id
	//driver.close();
   // WebElement buy=driver.findElement(By.name("submit.buy-now"));
   // buy.click();
	
	WebElement addtocart=driver.findElement(By.id("buy-now-button"));
	addtocart.click();
	//WebElement proceed=driver.findElement(By.name("proceedToRetailCheckout"));
	//proceed.click();
    WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
    email.sendKeys(UN);
    WebElement cont=driver.findElement(By.xpath("//span[@id='continue']"));
    cont.click();
    Thread.sleep(2000);
    WebElement password= driver.findElement(By.xpath("//input[@id='ap_password']"));
    password.sendKeys(PW);
    WebElement signin=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    signin.click();
    }

}
