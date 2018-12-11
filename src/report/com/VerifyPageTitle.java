package report.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPageTitle {
	
	String url="http://www.facebook.com";
	
	@Test
	public void verifyTitle()
	{
		//we need to add jar for extent report
		ExtentReports logger=ExtentReports.get(VerifyPageTitle.class);
		logger.init("F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\EXTENDS REPORT FOLDER\\AdvReport.html", true);
		logger.startTest("we are verifying test cases");
		System.setProperty("webdriver.chrome.driver", "F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "browser is up and running");
		
		driver.get(url);
		logger.log(LogStatus.INFO, "Application is up and running");
		
		
		String str=driver.getTitle();
		logger.log(LogStatus.INFO, "title is capture");
		Assert.assertTrue(str.contains("Selenium"));
		
		logger.log(LogStatus.PASS, "title is verified");
		//logger.log(LogStatus.PASS,Utility.captureScreenShot(driver, "Kaustubh"));
		logger.attachScreenshot(Utility.captureScreenShot(driver, "Kaustubh"));
		//now we are attaching image//we are not taking the screenshot
		
		//logger.attachScreenshot("D:\\ileana\\Ilena D2.png");
		logger.endTest();
		
		
		
	}

	
	
	
	
	

}
