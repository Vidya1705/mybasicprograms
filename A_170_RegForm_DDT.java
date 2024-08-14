package BasicsSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_170_RegForm_DDT 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	/*FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    Workbook w1=WorkbookFactory.create(f1);
    String Fname= w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
    System.out.println(Fname);
    String Lname= w1.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
    System.out.println(Lname);
    String Email= w1.getSheet("Login").getRow(3).getCell(0).getStringCellValue();
    System.out.println(Email);
    String Mobile =NumberToTextConverter.toText(w1.getSheet("Login").getRow(4).getCell(0).getNumericCellValue());
    System.out.println(Mobile);*/
	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
//String a=	NumberToTextConverter.toText(w1.getSheet("form").getRow(0).getCell(3).getNumericCellValue());
String a1=	w1.getSheet("form").getRow(0).getCell(0).getStringCellValue();
String a2=	w1.getSheet("form").getRow(0).getCell(1).getStringCellValue();
String a3=	w1.getSheet("form").getRow(0).getCell(2).getStringCellValue();
String a=	NumberToTextConverter.toText(w1.getSheet("form").getRow(0).getCell(3).getNumericCellValue());
String a4=	w1.getSheet("form").getRow(0).getCell(4).getStringCellValue();
String a5=	w1.getSheet("form").getRow(0).getCell(5).getStringCellValue();
String a6=	NumberToTextConverter.toText(w1.getSheet("form").getRow(0).getCell(6).getNumericCellValue());
String a7=	w1.getSheet("form").getRow(0).getCell(7).getStringCellValue();

//System.out.println(a1);
//System.out.println(a2);
//System.out.println(a3);
//System.out.println(a);
ChromeDriver driver= new ChromeDriver();
driver.get("https://grotechminds.com/registeration-form/");
driver.manage().window().maximize();
WebElement First_name=driver.findElement(By.xpath("(//input)[2]"));
First_name.sendKeys(a1);

WebElement last_name=driver.findElement(By.name("lastName"));
last_name.sendKeys(a2);
WebElement email=driver.findElement(By.name("email"));
email.sendKeys(a3);
WebElement phone=driver.findElement(By.name("phone"));
phone.sendKeys(a);

WebElement gender=driver.findElement(By.id("gender"));
	Select s1=new Select(gender);
	s1.selectByVisibleText("Female");
WebElement state=driver.findElement(By.id("state"));
	Select s2=new Select(state);
	s2.selectByVisibleText("Karnataka");

	WebElement aadhaar=driver.findElement(By.name("aadhaar"));
	aadhaar.sendKeys(a6);
	WebElement PAN=driver.findElement(By.name("pan"));
	PAN.sendKeys(a7);
	////input[@id='terms']
	//WebElement terms=driver.findElement(By.xpath("//input[@id='terms']"));
	//terms.sendKeys(a8)
	
	


    
    
	}

}
