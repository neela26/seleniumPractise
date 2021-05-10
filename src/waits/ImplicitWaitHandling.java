package waits;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Neelam

 *this is type of dynamic wait 
 *1.implicitwait method wait that uch time specify in argument until webelement is not found 
 *if web elemnt found before that time it not wait total time that we where specify it just check web element present on web page or not
 *if it not found web elemnt within specified time it throw exception no such element
 *this wait is applicable to complete web page not single web element
 *
 *2.pageloadTimeout method takes time as argument if web page not load in specific time period it throw timeout exception 
 *this also applicable to complete web page not to single web element
 * 
 */
public class ImplicitWaitHandling {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://groww.in/");
        
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MILLISECONDS);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       WebElement mainsearch = driver.findElement(By.cssSelector("#mainSearch1010"));
       mainsearch.sendKeys("sbi");
      // mainsearch.click();
        
        Actions act=new Actions(driver);
        
       act.sendKeys(mainsearch,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
       // act.sendKeys(mainsearch,"sbi").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
		
	}
}
