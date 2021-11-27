package Example;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Alert1 {

WebDriver driver;

@BeforeClass
public void launchBrowser () throws InterruptedException{

System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}


@Test
public void alerthandle() throws InterruptedException {

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Alert a1=driver.switchTo().alert();
System.out.println(a1.getText());
a1.accept();

}



@Test
public void alert2() throws InterruptedException {


driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
Thread.sleep(10000);
Alert a2=driver.switchTo().alert();
System.out.println(a2.getText());
a2.dismiss();

}


@Test
public void alert3() throws InterruptedException {

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
Thread.sleep(10000);
Alert a3=driver.switchTo().alert();
a3.sendKeys("prajkta is here");
Thread.sleep(3000);
System.out.println(a3.getText());
a3.accept();



}


}