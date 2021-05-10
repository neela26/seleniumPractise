package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
 static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Fmbasic.facebook.com%2Flogin%2Fsave-password-interstitial%2F&_rdr");
	
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select selectedday=new Select(day);
		// a. select by index
		
	 // selectedday.selectByIndex(7);
	//	selectedday.deselectByIndex(8);
	  //select by value
	//  selectedday.selectByValue("8");
		
		selectedday.selectByVisibleText("15");
  } 
}
