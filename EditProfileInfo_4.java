package Amazon_source;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class EditProfileInfo_4 
{
    public static WebDriver driver;
 
  @FindBy(xpath="//span[.='Edit login, name, and mobile number']")
  WebElement login_security;
  
  @FindBy(linkText = "Edit")
  WebElement Edit;
  
  @FindBy(xpath="//input[@class='a-button-input']")
  WebElement save;
  
  public void login()
  {
	  login_security.click();
  }
  public void Editbutton()
  {
	  Edit.click();
  }
  public void Savechanges()
  {
	  save.click();
  }
  
  
  
  
  /*@FindBy(linkText = "Profile")
  WebElement yourprofile;
  
  @FindBy(linkText = "Edit your profile")
  WebElement Editprofile;
  
  @FindBy(id="profile_name")
  WebElement profilename;
  
  @FindBy(id="<span id=\"save-public-activity-announce\" class=\"a-button-text\" aria-hidden=\"true\">Save</span>")
  WebElement save;
  
  public DDT d1= new DDT();
  
  public void profile()
  {
	  yourprofile.click();
  }  
  public void edit_profile()
  {
	  Editprofile.click();
  }
  public void profilenm()
  {
	  profilename.sendKeys("Vidya A");
  }
  public void save()
  {
	  save.click();
  }*/
  
  public EditProfileInfo_4 (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
	
	
}
