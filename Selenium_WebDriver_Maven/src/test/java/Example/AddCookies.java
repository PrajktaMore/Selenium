package Example;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCookies {
  @Test
  public void addCookies() {
  
  	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		
		d1= new ChromeDriver();
		
		 d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");


			
		 
		 d1.findElement(By.id("ap_email")).sendKeys("Prajkta");
			
			d1.findElement(By.id("continue")).click();
  
			// Set <Cookie> cookies= d1.manage().getCookies();

      //System.out.println("Size of cookies: "+cookies.size());
         
     /*  for(Cookie cookie:cookies)
         {
        	System.out.println(cookie.getName()+" "+cookie.getValue());
         }
  */
       //  System.out.println(d1.manage().getCookieNamed("session-id-time"));  //this gives full cookie value
  
      //Add new cookie to browser   
			  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
        Cookie cobj= new Cookie("mycookie","1234567890");
        
        d1.manage().addCookie(cobj); 
        
        Set <Cookie> cookies= d1.manage().getCookies();

        
        System.out.println("Size of cookies: "+cookies.size());
        
        for(Cookie cookie:cookies)
        {
       	System.out.println(cookie.getName()+" "+cookie.getValue());
        }
        
        
  }
  
}
