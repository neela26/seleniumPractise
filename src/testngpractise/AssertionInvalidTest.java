package testngpractise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionInvalidTest {
    static	 WebDriver driver;
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
	   driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Reporter.log(" browser launch",true);
	}
//	
//	@BeforeMethod
//	public void login() {
//		
//		
//	}
	
	@Test
	public void tescase1() {
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("adminjbkj");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    
	    driver.findElement(By.name("Submit")).click();
	    String invalidMsg=driver.findElement(By.id("spanMessage")).getText();

	    String actual=invalidMsg;
		String expected="Invalid credentials";
		Assert.assertEquals(actual,expected);
		Reporter.log("invalid taste case",true);

	    
	}
	
	
	@Test
	public void testcase2() {
		Reporter.log("test case2",true);
	}
	
//	@AfterMethod
//	public void logout() {
//		
//	}
	
	@AfterClass()
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
