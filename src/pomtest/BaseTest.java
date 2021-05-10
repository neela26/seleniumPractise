package pomtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;

public class BaseTest {

	static WebDriver driver;
	public LoginPage lp;
	
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("testurl"));
		
	
	
	}
	
	
	@BeforeClass
	
	public void objectCreation() throws IOException
	{
		 lp = new LoginPage(driver);
	}
	
	
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
