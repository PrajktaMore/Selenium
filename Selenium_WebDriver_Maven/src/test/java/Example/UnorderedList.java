package Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnorderedList {
  @Test
  public void unordered_List() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/autoComplete.html");

		d1.findElement(By.id("tags")).sendKeys("A");
		Thread.sleep(4000);//to get the list loaded we give wait statement

		List<WebElement> ele= d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));//Same Xpath value can be used for any unordered list
		
		Thread.sleep(4000);
		for(WebElement list:ele)
		{
			if (list.getText().equalsIgnoreCase("SOAP"))
			{
			list.click();
			break;
			}
		}
		
  }
}
