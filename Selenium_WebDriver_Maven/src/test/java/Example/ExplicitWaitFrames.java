package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitFrames {
  @Test
  public void framesExplicitWait() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1= new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/frame.html");
		 WebDriverWait var1=new WebDriverWait(d1,10);
		 
	//	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		 
		 var1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"wrapframe\"]/iframe")));
		 
		 d1.switchTo().frame(0);
  
  
		 System.out.println(d1.getWindowHandle());
  }
}
