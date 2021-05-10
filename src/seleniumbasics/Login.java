package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Login  {
  static WebDriver driver;

//	public static void intialize() {
//		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
//
//		driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		driver.manage().window().maximize();
//	}
//  public boolean login(String username, String password) {
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(username);
//	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
//	    
//	  //*[@class='button hover']
//	    
//	    driver.findElement(By.name("Submit")).click();
//		return true;
//	}     

}
