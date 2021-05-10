package seleniumbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShots;

public class InvalidLogin {
 static	WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\manualTesting\\\\sel\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Axcsedmin");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("adminsd123");
		
	    driver.findElement(By.name("Submit")).click();
	    String invalidMsg=driver.findElement(By.id("spanMessage")).getText();
	    if(invalidMsg.equals("Invalid credential")) {
	    	System.out.println("testcase pass");
	    }
	    else {
	    	
	    	System.out.println("testcase fail");
	    	ScreenShots.captureScreenShots(driver, "oranghrmlogin");	

	    }
		
	}
}
