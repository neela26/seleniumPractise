package actionclassdisc;


import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassBasics {
  static	WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Fmbasic.facebook.com%2Flogin%2Fsave-password-interstitial%2F&_rdr");
		
		 driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Neelam");
     
		 Actions act=new Actions(driver);
		 act.sendKeys(Keys.TAB).sendKeys("Rasal").build().perform();
		 act.sendKeys(Keys.TAB).sendKeys("94515456466").build().perform();
		 act.sendKeys(Keys.TAB).click(driver.findElement(By.xpath("//*[@name='sex' and @value='1']"))).build().perform();
		  // List<WebElement> dayList = driver.findElements(By.xpath("//*[@id='day']//option"));

//		 for(WebElement day:dayList) {
//			   WebElement d2=dayList.get(25);
//			   if(d2.getText().equals("26"))
//				   act.sendKeys(Keys.TAB).d2.click();
//			   
//		   }
		   
		 
		 WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		 WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));

		 Select s=new Select(day);
		  s.selectByValue("10");
		 
      act.sendKeys(day,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
      
      act.sendKeys(month,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
      act.sendKeys(year,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();

      
      
         WebElement pass = driver.findElement(By.xpath("//*[@id='password_step_input']"));
      
		 act.sendKeys(pass,Keys.TAB).sendKeys("neelam123").build().perform();

      
      

      
		   
		 
	}

}
