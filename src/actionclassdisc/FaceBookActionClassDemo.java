package actionclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookActionClassDemo {
	  static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Fmbasic.facebook.com%2Flogin%2Fsave-password-interstitial%2F&_rdr");
	
		driver.manage().window().maximize();
		WebElement firstnametext = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		Actions act= new Actions(driver);
		//Thread.sleep(2000);
		act.sendKeys(firstnametext,"Neelam").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		//.keyUp(Keys.CONTROL).sendKeys("c")
		
	
	}
}

