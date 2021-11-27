package Example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
  @Test
  public void selectCheck() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://www.leafground.com/pages/checkbox.html");
	  
	  
	  //Copy Xpath from chrome
	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
	
	  WebElement e1=d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
	  
	  if(!e1.isSelected())
	  {
		  e1.click();
		  
	  }
	  
	  
	  System.out.println("Deselect if selected");
 WebElement e2=d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
	  
	  if(e2.isSelected())
	  {
		  e2.click();
		  
	  }
	 
      System.out.println("All check box selected");


	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click(); // Option-1
	  Thread.sleep(2000);
	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click(); // Option-2
	  Thread.sleep(2000);
	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click(); // Option-3
	  Thread.sleep(2000);
	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click(); // Option-4
	  Thread.sleep(2000);
	  d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click(); // Option-5
	  Thread.sleep(2000);

	  d1.close();

	  }
    }
