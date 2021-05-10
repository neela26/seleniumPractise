package popuphandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Neelam
 * handling popup of grow login with continues as gamail
 */
public class ChildBrowserPopUpHandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
		
		
		
		//*[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='gsb183ContinueTxt']")).click();
		
		          String parentid = driver.getWindowHandle();
		
		Set<String> allwindowid = driver.getWindowHandles();
		
		System.out.println("parent id is:"+parentid);
		for(String id:allwindowid) {
			if(!(id.equals(parentid))) {
			System.out.println(id);	
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("neelamrasal75@gmail.com");
//			Thread.sleep(2000);
		//	driver.close();
			}
		}
		driver.findElement(By.xpath("(//*[@class='VfPpkd-RLmnJb'])[1]")).click();

		
		//driver.findElement(By.xpath("(//*[@class='rodal-close'])[1]")).click();
	}

}
