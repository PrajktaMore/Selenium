package functionality;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.TimeSheetElementsCS;

public class TimeSheetFunctionalityCS {
  @Test
  public void functions() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1=new ChromeDriver();
		
        d1.get("https://www.myhcl.com");	
        
    	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TimeSheetElementsCS ele=new TimeSheetElementsCS();
        Thread.sleep(5000);

        
        ele.emailID(d1).sendKeys("prajktaudayku.more@hcl.com");
        
        ele.next(d1).click();
        
        ele.password(d1).sendKeys("@Iamagirl7");
        
        Thread.sleep(5000);
        
        ele.signin(d1).submit();
        
        Thread.sleep(5000);

        ele.check(d1).click();
        
        Thread.sleep(10000);

        
        ele.staySignIn(d1).click();
        
        
       ele.search(d1).sendKeys("iTi");
        //Thread.sleep(5000);
      

      List<WebElement> ele1= (List<WebElement>) ele.list(d1);
      
      for(WebElement list:ele1)
		{
			if (list.getText().equalsIgnoreCase("iTime (Time Sheet Management System)"))
			{
		     //Thread.sleep(2000);

			list.click();
	       // Thread.sleep(10000);
			break;
			}
		}
      
     //
      Thread.sleep(5000);

      //boolean e1=ele.timeentry1(d1).getText().equalsIgnoreCase("09:00");
      
     // System.out.println(e1);
     // ele.timeentry2(d1).sendKeys("9.00");
      Thread.sleep(2000);
    //  ele.timeentry1(d1).sendKeys("9.00");
    	ele.save(d1).click();
    	    
  } 	
      
}
