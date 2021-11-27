package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDropDown {
  @Test
  public void explicitWaitDropDown() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1= new ChromeDriver();
	  
	  d1.get("http://www.leafground.com/pages/Dropdown.html");
	  
	//  d1.findElement(By.xpath("//select[@name='dropdown2']")).click();
		 
	 WebDriverWait var1=new WebDriverWait(d1,10);
		 
	var1.until(ExpectedConditions.elementToBeSelected(By.xpath("//select[@name='dropdown2']")));
		 
		 
   Select drop1=new Select(d1.findElement(By.xpath("//select[@name='dropdown2']")));
	       
	       drop1.selectByValue("3");
  }
}
