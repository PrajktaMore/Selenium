package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PageFactoryElemnt {
 
	  
	  @FindBy(id="ap_email")
	  public static WebElement emailid;
	  
	  @FindBy(xpath="//input[@id='continue']")
	  public static WebElement continue_button;
  
}
