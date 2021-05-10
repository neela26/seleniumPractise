package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
	    WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement login = driver.findElement(By.id("btnLogin"));
		 username.sendKeys("admin");
		password.sendKeys("admin123");
		 login.click();

		
//		if(!(username.equals(" ")&&password.equals(" "))){
//		 login.click();
//		 System.out.println("login pass");
//		}

//		WebElement forgotPassword=driver.findElement(By.linkText("Forgot your password?"));
//	    forgotPassword.click();
		 Thread.sleep(2000);
	   driver.findElement(By.id("welcome")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.linkText("Logout")).click();
		 
		 
		 
	}
}
