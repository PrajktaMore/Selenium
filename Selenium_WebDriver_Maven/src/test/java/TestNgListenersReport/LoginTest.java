package TestNgListenersReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login By Email");
		
		Assert.assertEquals("prajkta", "prajkta");//true
		
	}

	@Test
	public void loginByFacebook()
	{
		System.out.println("Login By facebook");
		Assert.assertEquals(true, false);//false
	}
	
}
