package seleniumbasics;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;
import utility.ExcelWriter;
/**
 * 
 * @author Neelam
 *
 *at time of loading script some webelement attribute 
 *change dyanamically but some words are common using which we can locate web element this use of contains 
 *
 */
public class LoginXpathContains {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@id, 'txtUser')]")).sendKeys(ExcelReader.excelReadData(0,0));
	    driver.findElement(By.xpath("//*[@id='txtPassword' and @name = 'txtPassword']")).sendKeys(ExcelReader.excelReadData(15, 0));	
	    
	    
	 driver.findElement(By.xpath("//*[contains(@name,'Submit')]")).click();
//	 
	 
	 
	// ExcelWriter.excelWriteData(25, 0,"rasal");
	}

}
