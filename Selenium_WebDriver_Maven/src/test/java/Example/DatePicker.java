package Example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Code date 27/10/2021


public class DatePicker {

	@Test
	public void date() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		
		//document.getElementByxpath('value').value='value'---is used to locate and use element in JavascriptExecuter
		
		jse.executeScript("document.getElementById('datepicker1').value='29/08/2017'");

		
		jse.executeScript("document.getElementById('datepicker2').value='29/08/2017'");
}
}