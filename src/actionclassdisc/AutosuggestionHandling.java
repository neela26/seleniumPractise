package actionclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionHandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\manualTesting\\sel\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);		
		WebElement autotext = driver.findElement(By.xpath("//*[@name='q']"));
		    autotext.sendKeys("ind");

		    Thread.sleep(2000);
		act.sendKeys(autotext,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
