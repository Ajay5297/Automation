package Sequesncail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	
	
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
	}
	
	@Test
		
	public void testcase3() throws InterruptedException  {	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ajay");
		
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("Ajaypatul5297@gmail.com");
		
		Thread.sleep(5000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("ajay");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	
	public void closeApp() {
		driver.quit();
	}

}
