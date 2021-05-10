package actionclassdisc;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\manualTesting\\sel\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
	   driver.manage().window().maximize();
	   
       JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   js.executeScript("window.scrollBy(0,500)");
	   
	  
//	   
	
//	   js.executeScript("arguments[0].click()",dragelement);
//	   js.executeScript("arguments[0].click()",dropement);
//

	   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	   driver.switchTo().frame(iframe);
	   
	   WebElement dragelement = driver.findElement(By.xpath("//*[@id='draggable']"));

	   WebElement dropement = driver.findElement(By.xpath("//*[@id='droppable']"));
	   
	   Actions act=new Actions(driver);
	   act.clickAndHold(dragelement).moveToElement(dropement).build().perform();
	   
	  driver.switchTo().parentFrame();
	   Thread.sleep(2000);
	  
	   driver.findElement(By.xpath("//ul//li//a[text()='Slider']")).click();
	
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,500)");
	   
	   WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	   driver.switchTo().frame(iframe1);
	    WebElement dragto = driver.findElement(By.xpath("//*[@id='slider']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	   
	   act.dragAndDropBy(dragto, 500, 0).build().perform();

	}
}
