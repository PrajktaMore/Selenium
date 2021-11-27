package Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioBtn {

	@Test
	public void radioBtn()
	
	{
System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		
		d1= new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/radio.html");
		
		d1.findElement(By.id("yes")).click();
		
		d1.findElement(By.cssSelector("input[value='0'][name='news']")).click();
		
		List<WebElement> list= d1.findElements(By.cssSelector("input[type='radio'][name='age']"));
		
		for(WebElement e:list)	
		{
			if(e.getAttribute("value").equals("1"))
			{
			if(!e.isSelected())
			{
				e.click();
			}
			}
			
		}
	}
}

