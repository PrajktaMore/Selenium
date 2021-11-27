package Example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {

	@Test
	public void link() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();

		d1.get("http://www.leafground.com/pages/Link.html");
		
	    Thread.sleep(2000);
        
       d1.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
       
       Thread.sleep(2000);
       
       d1.navigate().back();
       
       Thread.sleep(2000);

       d1.findElement(By.linkText("Go to Home Page")).click();
        
       Thread.sleep(2000);
       
       d1.navigate().back();
       
       Thread.sleep(2000);

       d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click();

       Thread.sleep(2000);
       
       d1.navigate().back();
       
      Thread.sleep(2000);

      List <WebElement>li=d1.findElements(By.tagName("a")); 
      
      int size=li.size();
      
       System.out.println("No. of links in page is "+size);
	}

}