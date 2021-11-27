package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_Image {

	@Test
	public void image_link() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

		d1.get("http://www.leafground.com/");
        
      d1.findElement(By.xpath("//img[contains(@src,'images/edit.png')]")).click();
      
      Thread.sleep(2000);
      
      d1.findElement(By.xpath("//img[contains(@src,'../images/testleaf_logo.png')]")).click();

      Thread.sleep(2000);

      d1.close();
	}

}