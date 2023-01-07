package Sequesncail;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sequencial {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void demo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
	}
	
	@Test
		
	public void testcase1() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("identify_email")).sendKeys("7507175319");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("did_submit")).click();
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
