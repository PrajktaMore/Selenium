package Example;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenJunit {
	@Test // If import @Test method from TestNg will become TestNg method
	public void m1() throws BiffException, IOException{

		Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\prajktaudayku.more\\OneDrive - HCL Technologies Ltd\\Desktop\\Excel\\file.xls"));

		Sheet s1=w1.getSheet(0);

		for( int i=1;i<s1.getRows();i++) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D55759171661%26hvpone%3D%26hvptwo%3D%26hvadid%3D294135909733%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4102074232999251268%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D20453%26hvtargid%3Dkwd-298479560553%26hydadcr%3D5840_1738694%26gclid%3DCjwKCAjwtfqKBhBoEiwAZuesiDwX8hiKGLP_-djuY9kDRLqUW4ZEPSmvzgohXudE8PYENWBhsPDF6xoCppIQAvD_BwE&prevRID=8CVGF8B2FRNEEDFFW60C&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

			String username = s1.getCell(0,i).getContents();//getCell(column No., row No.)
			String password= s1.getCell(1,i).getContents();

			driver.findElement(By.id("ap_customer_name")).sendKeys(username );
			driver.findElement(By.id("ap_password")).sendKeys(password );
			driver.findElement(By.id("continue")).click();


		}

	}



}