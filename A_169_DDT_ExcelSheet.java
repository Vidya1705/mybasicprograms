package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_169_DDT_ExcelSheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
      FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
      Workbook w1= WorkbookFactory.create(f1);
     /* Sheet s1= w1.getSheet("Login");
      Row r1= s1.getRow(0);
      Cell c1= r1.getCell(0);
      String UN= c1.getStringCellValue();
      System.out.println(UN);
      Sheet s2= w1.getSheet("Login");
      Row r2= s2.getRow(0);
      Cell c2= r2.getCell(1);
      String PW= c2.getStringCellValue();
      System.out.println(PW);*/
      String UN= w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
      String PW= w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
   //   System.out.println(UN);
     // System.out.println(PW);
      ChromeDriver driver= new ChromeDriver();
  	driver.get("https://www.facebook.com");
  	driver.manage().window().maximize();
  	WebElement username= driver.findElement(By.id("email"));
  	username.sendKeys("UN");
  	WebElement password= driver.findElement(By.id("pass"));
  	password.sendKeys("PW");
  	WebElement loginbutton= driver.findElement(By.name("login"));
  	//loginbutton.click();
  	loginbutton.sendKeys(Keys.ENTER);

	
	
	}

}
