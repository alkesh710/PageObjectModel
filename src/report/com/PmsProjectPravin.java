package report.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PmsProjectPravin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://projects.javabykiran.com/Pms/");
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='form-control placeholder-no-fix required']")).sendKeys("pass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
