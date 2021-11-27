package Example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Code date 27/10/2021

public class GetCookies {
  @Test
  public void getcookies() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		
		d1= new ChromeDriver();
		
	  
	  d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		d1.findElement(By.id("ap_email")).sendKeys("Prajkta");
		
		d1.findElement(By.id("continue")).click();
		
		File f1=new File("C:\\Users\\prajktaudayku.more\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\cookies.data");
		
		try {
			f1.createNewFile();
			
			FileWriter fw=new FileWriter(f1);
			//file writer will take character by character and write in file
			BufferedWriter bw=new BufferedWriter(fw);
			//Buffered writer will take collection of characters and write in file
			//we cant use Buffer writer without fileWriter
			
			for(Cookie ck:d1.manage().getCookies()) {
				bw.write((ck.getDomain()+";"+ck.getName()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.getValue()+";"+ck.isSecure()));
			 bw.newLine();
			}
			bw.close();
			fw.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

  }
}
