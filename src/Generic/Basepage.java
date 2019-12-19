package Generic;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage
{
	WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void titlewait(String excepted_title)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(excepted_title));
			Reporter.log("pass:title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("fail:title is not matching", true);
			Assert.fail();
		}
	}
		public void element_visibility(WebElement element)
		{
			try
			{
				WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("pass:element is visible");
			}
			catch(Exception e)
			{
				Reporter.log("element is not visible",true);
				Assert.fail(); //emailable report shows status "passed" though script fails. To overcome this we add assert.fail
			}			
		}
		
}

