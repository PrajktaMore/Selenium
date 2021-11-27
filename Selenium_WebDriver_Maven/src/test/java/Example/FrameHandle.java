package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandle {
  @Test
  public void frame_handle() throws InterruptedException {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Frames.html");
	  
	  d1.switchTo().frame(0);
	  
	  d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("selenium");
	  
	  Thread.sleep(2000);
	  
	  d1.switchTo().defaultContent();//To get control on default/base screen
	  
	d1.findElement(By.xpath("//a[@href='#Multiple']")).click();
	
	
	//By using webelement
	//WebElement f1=d1.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));	
	//d1.switchTo().frame(f1);
	
	d1.switchTo().frame(1);
	WebElement f2=d1.findElement(By.xpath("/html/body/section/div/div/iframe"));
	d1.switchTo().frame(f2);
	
	  Thread.sleep(2000);

	d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Webdriver");
	  Thread.sleep(2000);

	  d1.close();
  }
}
