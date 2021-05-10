package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrowwAutoSuggestion {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		 WebElement searchtext = driver.findElement(By.xpath("//*[@id='mainSearch1010']"));
		 
		 searchtext.click();
		 searchtext.sendKeys("sbi");
		 
		Actions act=new Actions(driver);
		act.sendKeys(searchtext,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
