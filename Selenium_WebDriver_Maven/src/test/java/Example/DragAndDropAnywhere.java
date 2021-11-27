package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropAnywhere {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/drag.html");
		
		WebElement el1=d1.findElement(By.id("draggable"));
		
	
		Actions act1=new Actions(d1);
		
		act1.dragAndDropBy(el1, 250, 350).build().perform();
		//Actions.dragAndDropBy(Sourcelocator, x-axis pixel of Destinationlocator, y-axis pixel of Destinationlocator);

  }
}
