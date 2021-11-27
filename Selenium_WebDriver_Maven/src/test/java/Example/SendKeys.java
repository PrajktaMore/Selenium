package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SendKeys {
@Test
public void dropdownSendKeys() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();



driver.get("http://www.leafground.com/home.html");


driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
Thread.sleep(2000);

// Enter your email address
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prajktamore@gmail.cpm");
Thread.sleep(2000);

// Append a text and press keyboard tab
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"))
.sendKeys("Append the keys");
Thread.sleep(2000);

// Get default text entered
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).sendKeys("Under Test");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
Thread.sleep(2000);

// Clear the text
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).sendKeys("Sample@9764");
Thread.sleep(3000);

//driver.close();
}
}