package seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToOrangeWithConfig {
	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webdriverexe\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	Properties pro=new Properties();
	
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
	pro.load(fis);

	System.out.println(pro.getProperty("testurl"));
	
	driver.get(pro.getProperty("testurl"));
	
	driver.findElement(By.xpath("//*[contains(@id, 'txtUser')]")).sendKeys(pro.getProperty("username"));
	driver.findElement(By.xpath("//*[@id='txtPassword' and @name = 'txtPassword']")).sendKeys(pro.getProperty("password"));
	 driver.findElement(By.xpath("//*[contains(@name,'Submit')]")).click();
	
	}

}
