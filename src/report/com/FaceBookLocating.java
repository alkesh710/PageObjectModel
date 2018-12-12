package report.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLocating {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("alkesh");
		
		
		
		
		
		
	}

}
