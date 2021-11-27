package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Elements {
  @Test
  
/*  public WebElement emailid(WebDriver d1) {	  
	  
	  
	  return d1.findElement(By.id("ap_email"));
	  
  }  
  public WebElement continue_button(WebDriver d1)
  {
	  
	 return d1.findElement(By.id("continue")); 
	 	  
  }
   */
  ////////////////OR//////////////////
  
public static WebElement emailid(WebDriver d1) {	  
	  
	  return d1.findElement(By.id("ap_email"));
}  
  public static WebElement continue_button(WebDriver d1)
  {
	  
	 return d1.findElement(By.id("continue")); 
	 
	  
  }
  
}
