package actionclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickHandling {
	
static	WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		 WebElement buzz = driver.findElement(By.xpath("//*[@id='menu_buzz_viewBuzz']"));
		 
		 Actions act=new Actions(driver);
		 act.contextClick(buzz).perform();
	}

}
