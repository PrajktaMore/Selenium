package Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderedList {
  @Test
  public void orderedList() {
  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/selectable.html");
  
  
		List<WebElement> ele= d1.findElements(By.xpath("//ol[@id='selectable']/li"));
		//for x path /li is given to select all ele in list
		System.out.println(ele.size());
		
		Actions act=new Actions(d1);
		
		act.keyDown(Keys.CONTROL)//CONTROL Key remains pressed bcoz of this to select multiple elemnts
		.click(ele.get(0))
		.click(ele.get(2))
		.click(ele.get(4))
		.click(ele.get(6)).build().perform();
  }
}
