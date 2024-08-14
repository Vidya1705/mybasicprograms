package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_172_AmazonLogin_DDT
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
      FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
      Workbook w1=WorkbookFactory.create(f1);
      String UN= w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
      String PW= w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
      ChromeDriver driver = new ChromeDriver();
  	driver.get("https://www.amazon.in/");
  	driver.manage().window().maximize();
  	WebElement e1 = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
  	WebElement e2 = driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]//span"));	
  	Actions a = new Actions(driver);
  	a.moveToElement((e1)).moveToElement(e2).click().perform();
  	WebElement username= driver.findElement(By.name("email"));
  	username.sendKeys(UN);
  	
  	
  	
      
      
	
	
	
	
	}

}
