package practise;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrameHandling {
   static WebDriver driver;
	public void switchToFrame(String parentid,String childid) {
		
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");		
		driver=new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		
		driver.manage().window().maximize();
		
//		 WebElement popup = driver.findElement(By.xpath("//*[@class='aurora-c-content Campaign__content']"));
//		 String parentid=driver.getWindowHandle();
//		 
//		
//		 System.out.println(parentid);
//		 Set<String> allwindowid = driver.getWindowHandles();
//		 
//		 for(String id:allwindowid) {
//			 if(!(id.equals(parentid))){
//				 driver.switchTo().window(id);
//				// driver.findElement(By.xpath("//*[@class='CloseButton__ButtonElement-sc-79mh24-0 gVNUOF aurora-CloseButton aurora-close aurora-ClosePosition--top-right']")).click();
//			 }
//		 }
		 
		 
		List< WebElement> listofiframe=driver.findElements(By.tagName("//iframe"));
		
		System.out.println(listofiframe.size());
		
		for(WebElement iframe:listofiframe) {
			//System.out.println(iframe.getText());
			driver.switchTo().frame(iframe.toString());
//			driver.switchTo().parentFrame();
//			driver.switchTo().defaultContent();
			
		}
	}
}
