package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo 
{
	public static void getphoto(WebDriver driver,String script_name)
	{		
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+script_name+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e)
		{
			
		}
	} 
}
