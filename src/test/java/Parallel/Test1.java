package Parallel;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver;
	
	@Parameters({"browserName"})
	
	@Test
	public void demo(String browser) {
		
		
		
		if(browser.equals(("chrome"))){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
//		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("7721840979");
		
		driver.findElement(By.id("pass")).sendKeys("Pratiksha");
		
		driver.findElement(By.name("login")).click();
		
		String title = (driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		if(title.equals("Log in to Facebook")) {
			System.out.print("Pass:The title is same");
		}
		else {
			System.out.println("Fail:The title is different");
		}
		
		driver.quit();
		
	}

}
