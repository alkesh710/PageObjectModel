package report.com;

import org.apache.bcel.verifier.statics.StringRepresentation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;





public class ExtentReportWithScreenShot {
	
	static WebDriver driver;
	static ExtentReports logger;
	ExtentTest test;
	
	@Test
	public void verifyBlogTitle()
	{
	  logger=ExtentReports.get(ExtentReportWithScreenShot.class);
		logger.init("F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\Alkesh_folderForExtendReport", true);
		logger.startTest("We are testing Site");
		
		System.setProperty("webdriver.chrome.driver","F:\\TESTNG VIDEO OF ALKESH\\\\alkesh selenium all software\\\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.log(LogStatus.INFO, "1");
		driver.get("http://www.learn-automation.com");
		
		logger.log(LogStatus.INFO, "2");
		String title=driver.getTitle();
		logger.log(LogStatus.INFO, "3");
		Assert.assertTrue(title.contains("Google"));
		logger.log(LogStatus.PASS, "4");	
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screen_ShotPath=Utility.captureScreenShot(driver, result.getName());
			logger.log(LogStatus.FAIL, "title verificatio",screen_ShotPath);
		}
		
	}
	

}
