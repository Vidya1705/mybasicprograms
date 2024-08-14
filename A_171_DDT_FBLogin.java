package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_171_DDT_FBLogin 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    Workbook w1= WorkbookFactory.create(f1);
    String UN= w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
    String PW= w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
    ChromeDriver driver= new ChromeDriver();
  	driver.get("https://www.facebook.com");
  	driver.manage().window().maximize();
  	WebElement username= driver.findElement(By.id("email"));
  	username.sendKeys(UN);
  	WebElement password= driver.findElement(By.id("pass"));
  	password.sendKeys(PW);
  	WebElement loginbutton= driver.findElement(By.name("login"));
  	//loginbutton.click();
  	loginbutton.sendKeys(Keys.ENTER);
	}

}
