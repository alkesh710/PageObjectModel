package report.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Utility {
	
	public static String captureScreenShot(WebDriver driver,String screenShotName)
	{
		try
		{
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String dest="F:\\SCREENSHOT"+screenShotName+".png";
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			return dest;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return e.getMessage();
		}
		
		
	}

}
