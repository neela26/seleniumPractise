package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Neelam
 *
 *1-findelements to locate multiple web eleement on web page
 * 2- what is dyanmaic xpath at the time of loading script we append value to create complete xpath
 */
public class CheckBoxHandling {
	
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\manualTesting\\sel\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    
	  //*[@class='button hover']
	    driver.findElement(By.name("Submit")).click();
	    
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	    
	   //List<WebElement> checkList = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
 
	   //to select all checkbox
//	   for(WebElement check:checkList) {
//		   check.click();
//
//	   
//	   }
	   //to select alternate checkbox
//	   for(int i=0;i<checkList.size();i=i+2) {
//		    checkList.get(i).click();
//	   }
	   //to select alternate checkbox
	   
	   for(int i=1;i<49;i=i+2)
	   { driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord')])["+i+"]")).click();
	   }
	   
	}

}
