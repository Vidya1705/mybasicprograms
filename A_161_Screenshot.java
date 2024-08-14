package BasicsSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_161_Screenshot
{
public static void main(String[] args) throws IOException
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://grotechminds.com/x-path/");
	driver.manage().window().maximize();
	TakesScreenshot ts= driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\User\\Desktop\\Screenshot\\vidya.png");
	FileHandler.copy(source, destination);
	
	
	
	}



































}
