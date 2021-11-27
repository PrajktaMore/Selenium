package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropToLoc {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag=d1.findElement(By.id("draggable"));
		
		WebElement drop=d1.findElement(By.id("droppable"));
		
		Actions act =new Actions(d1);
		
		act.dragAndDrop(drag, drop).build().perform();
  }
}
