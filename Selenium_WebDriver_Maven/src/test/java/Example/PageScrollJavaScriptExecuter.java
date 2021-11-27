package Example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Code date 27/10/2021


public class PageScrollJavaScriptExecuter {

	@Test
	public void pageScroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		
		jse.executeScript("scroll(0,450)");
		
		//Give approximate coordinates 
		// for scrolling vertically y-coordinate is given and x is zero

}
}