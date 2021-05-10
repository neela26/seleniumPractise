package waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();	
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS)
				.pollingEvery(9,TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h']"), "Selenium Webdriver"));
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	
	}

}
