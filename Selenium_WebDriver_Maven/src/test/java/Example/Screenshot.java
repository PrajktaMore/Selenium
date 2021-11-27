package Example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void login() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		
		d1= new ChromeDriver();
		
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D61665929249%26hvpone%3D%26hvptwo%3D%26hvadid%3D549595888300%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12801154921198892165%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvtargid%3Dkwd-298441375321%26hydadcr%3D5621_2275937%26gclid%3DEAIaIQobChMI95HouMu68wIV5JlmAh21cgQTEAAYASAAEgKrkfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		d1.findElement(By.id("ap_email")).sendKeys("prajktamore@gmail.com");
		
		d1.findElement(By.id("continue")).click();

		TakesScreenshot screen= (TakesScreenshot) d1;
		
	     File source=screen.getScreenshotAs(OutputType.FILE);
	     
	     File destination=new File("C:\\Users\\prajktaudayku.more\\OneDrive - HCL Technologies Ltd\\Desktop\\screenshot\\sc1.jpg");
		
	     FileHandler.copy(source, destination);
	     
	}

}
