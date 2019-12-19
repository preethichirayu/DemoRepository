package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class actitime_enter_timetrack_private extends Basepage
{	
	@FindBy(id="logoutLink")
	//@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;	
	
	@FindBy(xpath="//a[@class='content selected tt']")
	private WebElement Time_Track;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement Tasks;

	@FindBy(xpath="//a[@class='content reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement Users;
	
	public actitime_enter_timetrack_private(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}	
	public void clicklogout()
	{
		this.logout.click();
	}
	public WebElement getlogout()
	{
		return logout;
	}
	public void clickTime_Track()
	{
		this.Time_Track.click();
	}
	
	
		
	}

