package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {
  @Test
  public void alert() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Alerts.html");
	  
	  d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	  
	  Alert a1=d1.switchTo().alert();
	  
	  String str= a1.getText();
	  Thread.sleep(2000);
	  a1.accept();
	  System.out.println(str);
	  Thread.sleep(2000);

	  d1.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	  Thread.sleep(2000);

	  d1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	  Alert a2=d1.switchTo().alert();
	  Thread.sleep(2000);

	  a2.dismiss();
	  
	  Thread.sleep(2000);

	  
	  d1.findElement(By.xpath("//a[@href='#Textbox']")).click();
	  Thread.sleep(2000);

	  d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

	  Alert a3=d1.switchTo().alert();
	  Thread.sleep(2000);

	  a3.sendKeys("HCL");

	  Thread.sleep(2000);
	  String hcl=a3.getText();
	  System.out.println(hcl);
	  a3.accept();
  
	  Thread.sleep(2000);

	  d1.close();
  
  }
}
