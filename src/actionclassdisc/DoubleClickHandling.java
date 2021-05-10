package actionclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
       driver.manage().window().maximize();
       
       WebElement doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
       
       Actions act=new Actions(driver);
       act.doubleClick(doubleclick).perform();
	}
}
