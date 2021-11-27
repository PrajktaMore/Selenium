package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Code date 27/10/2021


public class ScrollWithinPageJavaScript {

	@Test
	public void withinPageScroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		
		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		d1.manage().window().maximize();
		
		
		WebElement el1=d1.findElement(By.xpath("//*[@id=\"mCSB_3_container\"]/p[9]/textarea"));
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;

		jse.executeScript("arguments[0].scrollIntoView(true);",el1);
		
		//In youtube upto what ele or video need to be visible
		//argument[0] :because no scrolling of whole page
 
		
		el1.sendKeys("Prajkta");
		

}
}
