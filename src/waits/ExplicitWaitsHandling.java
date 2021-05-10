package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/***
 * 
 * @author Neelam
 *
 */
public class ExplicitWaitsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();	
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
//		
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
//
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='disable']"))));
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		
		
		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='hidden']"))));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();

 		WebElement h2id = driver.findElement(By.xpath("//*[@id='h2']"));
		//wait.until(ExpectedConditions.textToBePresentInElement(h2id," Selenium Webdriver"));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"),"Selenium Webdriver"));
		driver.navigate().refresh();
//		driver.navigate().to(driver.getCurrentUrl());

		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
//		
//		driver.findElement(By.xpath("//*[@id='alert']")).click();
//		
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
		
//		WebElement checkboxselection = driver.findElement(By.xpath("//*[@id='ch']"));
//	driver.findElement(By.xpath("//*[@id='checkbox']")).click();
//	
//	wait.until(ExpectedConditions.elementSelectionStateToBe(checkboxselection, checkboxselection.isSelected()));
////	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//*[@id='checkbox']")).click();

		
		

	
	}
}
