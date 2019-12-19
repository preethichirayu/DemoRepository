package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.Basepage;

public class actitime_login_private extends Basepage
{
	//WebDriver dummy;
	//For FindBy we can use any of 8 locators
	@FindBy(id="username") //finds the address for webelement username
	private WebElement username;//declaration of webelement eg;public int i;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButtonContainer")
	private WebElement login;	
	
	//public actitime_login_private(WebDriver driver)
	//{
	//	PageFactory.initElements(driver,this); //pagefactory is Used to initialize nonstatic variables
	//}
	
	public actitime_login_private(WebDriver driver)
	{
		super(driver);
		//dummy=driver;
		PageFactory.initElements(driver,this); //pagefactory is Used to initialize nonstatic variables
	}
	
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	public void clicklogin()
	{
		this.login.click();
	}
/*	public void titlewait(String excepted_title)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(dummy, 10);
			wait.until(ExpectedConditions.titleIs(excepted_title));
			Reporter.log("pass:title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("fail:title is not matching", true);
			Assert.fail();
		}
	}*/
	
}























