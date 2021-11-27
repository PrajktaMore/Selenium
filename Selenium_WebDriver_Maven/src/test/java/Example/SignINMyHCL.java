package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignINMyHCL {
  @Test
  public void myHCL() {
	  
System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("https://www.myhcl.com/bprhome/Home/Index");
	  
	  
	  
	  
  }
}
