package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");

	   WebDriver d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement ele1=d1.findElement(By.id("email"));
		
		Actions act1=new Actions(d1);
		
		act1.sendKeys(ele1,"Prajkta")
		    .doubleClick() //to highlight 
		    .contextClick()  //to right click
		    .build()
		    .perform();
  }
}
