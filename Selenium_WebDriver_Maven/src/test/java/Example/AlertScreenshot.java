package Example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertScreenshot {
  @Test
  public void alert() throws InterruptedException, AWTException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Alerts.html");
	  
	  d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	  
	  Alert a1=d1.switchTo().alert();
	  
	  Robot r1=new Robot();
	  Dimension var1=Toolkit.getDefaultToolkit().getScreenSize();//Getting screen size as rectangle as computer screen is rectangle size
	  Rectangle rect1=new Rectangle(var1);
	  BufferedImage src=r1.createScreenCapture(rect1);//capturing screenshot of rectangle screen
	  File dest=new File(".//ScreenShot/s1");
	  ImageIO.write(src,"jpeg",dest);
	 
	  
	  
	  String str= a1.getText();
	  Thread.sleep(2000);
	  a1.accept();
	  System.out.println(str);
	  Thread.sleep(2000);

	/*  d1.findElement(By.xpath("//a[@href='#CancelTab']")).click();
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
  
*/
  }
}
