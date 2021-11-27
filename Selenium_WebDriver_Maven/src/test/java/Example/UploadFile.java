package Example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
  @Test
  public void fileUpload() throws AWTException, InterruptedException {
 
	  System.setProperty("webdriver.chrome.driver","C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1;
		d1=new ChromeDriver();
  
		Thread.sleep(3000);
		
	  d1.get("https://www.ilovepdf.com/word_to_pdf");
		
		d1.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(4000);
		
	String file="C:\\Users\\prajktaudayku.more\\Downloads\\test.docx";
	
	StringSelection select1 =new StringSelection(file); //this StringSelection converts normal data into transferrable 
	//content data file
	
	//When we cut or copy data in world doc it is temporarily stored in clipboard similararly for system also there 
	// is clipboard present which stores copied or cut data
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);// this copies test.docx file which 
	// become present to system clipboard ..owner to edit clipboard data is given null
	
	Robot r1=new Robot(); //anything we want to do in desktop we use robot class
	r1.keyPress(KeyEvent.VK_CONTROL);//virtual Key control
	r1.keyPress(KeyEvent.VK_V); //copied data in system clipboard get pasted in where default cursor that is in file name 
	
	r1.keyRelease(KeyEvent.VK_V); //1st releases V key then 
	r1.keyRelease(KeyEvent.VK_CONTROL); //releases cntrl key
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);

	}

  }
  
