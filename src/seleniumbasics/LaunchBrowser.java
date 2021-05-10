package seleniumbasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String browser="chrome";
//		if(browser.equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
//		
//	    driver=new ChromeDriver();
//		driver.get("https://www.youtube.com/");
//		
//		driver.manage().window().maximize();
//		
//		//driver.close();
//		
//		}
//		if(browser.equals("Edge"))
//		{
//		System.setProperty("webdriver.edge.driver", "F:\\manualTesting\\sel\\edge_driver\\msedgedriver.exe");
//		
//		driver=new EdgeDriver();
//		driver.get("https://www.youtube.com/");
//		}
		
		//stsrting two browser parallely
//		System.setProperty("webdriver.edge.driver", "F:\\manualTesting\\sel\\edge_driver\\msedgedriver.exe");
//		
//		driver=new EdgeDriver();
//		driver.get("https://www.youtube.com/");
		
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
//		
	    driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		Thread.sleep(10000);
//		driver.close();
		
		
		Dimension d= new Dimension(100, 200);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(200, 200);
		driver.manage().window().setPosition(p);
		
		
		
		
		
	}

}

