package actionclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumbasics.Base;
import seleniumbasics.LoginXpath;

public class MouseHoverHandling {

 static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

		
		WebElement Admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
	    WebElement usermangment = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	   WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);

		act.moveToElement(Admin).moveToElement(usermangment).build().perform();
		Thread.sleep(1000);
		act.moveToElement(user).click().perform();		
		//driver.quit();
	}
}
