package Amazon_Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Amazon_source.Homepage;
public class TestCase5search extends Launch_Quit
{
   @Test
   public void searchresults()
   {
	   Homepage h1= new Homepage(driver);
	   h1.search("shoes");    
   }
	
}
