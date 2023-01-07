package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void FaceBooklogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testCase3() throws InterruptedException {
		
		Thread.sleep(5000);
	
	driver.findElement(By.id("email")).sendKeys("7721840979");
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("pass")).sendKeys("Pratiksha");
	
	Thread.sleep(5000);
	
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(5000);
	
	String title = (driver.getTitle());
	
	
	//Assert.assertEquals(title, "46782414");
	
	SoftAssert asert = new SoftAssert();
	asert.assertEquals(title, "Log in to Facebook");
	
	Reporter.log(title,true);
	
	
	//System.out.println(driver.getCurrentUrl());
	
	String url = driver.getCurrentUrl();
	
	Reporter.log(url,true);
	
	
	
	if(title.equals("Log in to Facebook")) {
		System.out.print("Pass:The title is same");
	}
	else {
		System.out.println("Fail:The title is different");
	}
	
	asert.assertAll();
	
	
	}
	
	@AfterMethod
	
	public void CloseApp() {
		driver.quit();
	}
	

}
