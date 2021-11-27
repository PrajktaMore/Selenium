package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate_Cmnds {
  @Test
  public void navigate() throws InterruptedException {
		 
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	 	  
	 	  WebDriver d1=new ChromeDriver();
	 	  
	 	  d1.get("http://www.leafground.com/");
	 	  
	 	 d1.findElement(By.xpath("//img[@alt='Buttons']")).click();
	 	 
	 	 System.out.println(d1.getCurrentUrl());
		  
		  System.out.println(d1.getPageSource());
		 	 Thread.sleep(2000);

	 	 d1.navigate().back();
	 	 Thread.sleep(2000);
	 	 
	 	 d1.navigate().forward();
	 	 Thread.sleep(2000);

	 	 d1.navigate().refresh();
	 	 Thread.sleep(2000);

	 	 d1.navigate().to("http://demo.automationtesting.in/Windows.html");
	 	 Thread.sleep(2000);

	 	 d1.manage().window().maximize();
	 	 
	 	 Dimension dim1=new Dimension(350,250);
	 	 
	 	 d1.manage().window().setSize(dim1);
	  
  }
}
