package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
  @Test
  public void Implicit_Wait() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	 
	  WebDriver d1 =new ChromeDriver();

	  //As soon as initialize web browser give this wait statement
	  //As ele get reached it will skip the remaining time of 10 sec
	  //Implicit wait is for  each ele. in script
	 
	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  d1.get("http://www.leafground.com/");
 	  
	 	 d1.findElement(By.xpath("//img[@alt='Buttons']")).click();
	 	 
	 	 System.out.println(d1.getCurrentUrl());
		  
		  System.out.println(d1.getPageSource());

	 	 d1.navigate().back();
	 	 
	 	 d1.navigate().forward();

	 	 d1.navigate().refresh();

	 	 d1.navigate().to("http://demo.automationtesting.in/Windows.html");

	 	 d1.manage().window().maximize();
	 	 
	 	 Dimension dim1=new Dimension(350,250);
	 	 
	 	 d1.manage().window().setSize(dim1);
	  
  }
}
