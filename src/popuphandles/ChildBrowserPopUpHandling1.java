package popuphandles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Neelam
 * pop up handling of login of groww application
 */
public class ChildBrowserPopUpHandling1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("neelamrasal75@gmail.com");
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Continue']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("neel@2695");
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Submit']")).click();
		

		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.xpath("(//*[@class='otpinput88item'])[1]"));
		
		Actions act=new Actions(driver);
		act.sendKeys(pin,"2").sendKeys(Keys.TAB).sendKeys("6").sendKeys(Keys.TAB)
		.sendKeys("0").sendKeys(Keys.TAB).sendKeys("1").build().perform();
}
}
