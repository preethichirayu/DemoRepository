package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.html5.GetAppCacheStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest1 implements Autoconstant
{
	public WebDriver driver;
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void precondtion(String br)
	{
		if (br.equals("chrome"))
			driver=new ChromeDriver();
		else if(br.equals("firefox"))
			driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");		
	}
	
	@AfterMethod
	public void postcondition(ITestResult r)
	{
		int status = r.getStatus();
		String script_name = r.getMethod().getMethodName();
		if (status==2)
		{
			photo.getphoto(driver, script_name);
		}
		driver.close();		
	}	
}
