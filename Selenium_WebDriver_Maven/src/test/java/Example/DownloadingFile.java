package Example;
//date 29/10/2021
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadingFile {
  @Test
  public void downloadFile() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();
	  d1.get("http://www.leafground.com/pages/download.html");
		
		d1.findElement(By.linkText("Download Excel")).click();
		
		
		File list_files=new File("C:\\Users\\prajktaudayku.more\\Downloads");

		File[] total_files=list_files.listFiles();  //Inbuilt method listFiles() which returns array of files
		for (File file_required:total_files) {

			if(file_required.getName().equalsIgnoreCase("testleaf (2).xlsx"))//search for downloaded file
			{
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
  }
}

