package Amazon_Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
//Login to amazon
import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;
@Listeners(Utiliser.Listener1.class)
public class TestCase1login extends Launch_Quit
{   // WebDriver driver;
	@Test (retryAnalyzer=Utiliser.Retry.class)
	public void login_to_amazon() throws EncryptedDocumentException, IOException
	{
		Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_Amazon l1= new Login_Amazon(driver);
		l1.un();
		l1.cont_button();
		l1.password();
		l1.signin_button();
	}
}
