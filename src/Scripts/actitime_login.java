package Scripts;

import org.testng.annotations.Test;
import Generic.BaseTest;
import Generic.BaseTest1;
import POM.actitime_login_private;

public class actitime_login extends BaseTest1
{
	@Test
	public void loginscript()
	{	
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		actitime_login_private ob=new actitime_login_private(driver);
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.clicklogin();
		//String title = driver.getTitle();
		//System.out.println(title);
		ob.titlewait("actiTIME - Enter Time-Trac");
	}
}
