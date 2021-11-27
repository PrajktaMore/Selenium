package Example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
  @Test
  public void win_handle() throws InterruptedException {
	 
 System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Windows.html");
	  
	  d1.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
	  
	  Set<String> windows=d1.getWindowHandles();
	  
	  Iterator<String> itr=windows.iterator();
	  
	 String w1=itr.next();
	 
	 String w2=itr.next();
	 
	 System.out.println(w1);
	 System.out.println(w2);
	  
	 d1.switchTo().window(w2);
	  System.out.println(d1.getTitle());
	  Thread.sleep(2000);
	  d1.close();
	  d1.switchTo().window(w1);

	  Thread.sleep(2000);
	  //d1.close();
	  
	 // d1.switchTo().window(w1);
	  
	  d1.findElement(By.xpath("//a[@href='#Seperate']")).click();
	  
	  d1.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	  
	  Set<String> win1=d1.getWindowHandles();
	  
	  Iterator<String> itr1=win1.iterator();
	  
	  String w3=itr1.next();
	  String w4=itr1.next();
	  
	  System.out.println(w3);
	  
	  d1.switchTo().window(w4);	 
	  Thread.sleep(2000);
      d1.findElement(By.xpath("//a[@href='/documentation/webdriver/']")).click();
	  System.out.println(d1.getTitle());
	  Thread.sleep(2000);
	  d1.close();
	  
	  d1.switchTo().window(w3);
	  
	  d1.findElement(By.xpath("//a[@href='#Multiple']")).click();
	  
	  d1.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
	  
	  Set<String> win2=d1.getWindowHandles();
	  
	  Iterator<String> itr2=win2.iterator();
	  
	  String w5=itr2.next();
	  
	  String w6=itr2.next();
	  
	  String w7=itr2.next();	
	  
	  System.out.println(w6);
	  System.out.println(w7);

	  System.out.println(d1.getTitle());
	  
	
	  Thread.sleep(2000);
// w6=1st win= =selenium, win w7=index i.e. lastly opened window
	  
	  d1.switchTo().window(w7);
	  System.out.println(d1.getTitle());

	  Thread.sleep(2000);

	  d1.findElement(By.xpath("//input[@id='email']")).sendKeys("prajaktamore79@gmail.com");
	  
	  d1.findElement(By.id("btn1")).click();
	  
	  Thread.sleep(2000);

	  d1.close();
	  
	  d1.switchTo().window(w6);  
	  
	  Thread.sleep(2000);
      d1.findElement(By.xpath("//a[@href='/documentation/webdriver/']")).click();
	  System.out.println(d1.getTitle());
	 
	  Thread.sleep(2000);

	  d1.close();
	  
	  d1.switchTo().window(w5);
	  Thread.sleep(2000);

	  
	  d1.close();
	  
  }
}
