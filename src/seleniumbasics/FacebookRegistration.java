package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Fmbasic.facebook.com%2Flogin%2Fsave-password-interstitial%2F&_rdr");
		
		   List<WebElement> dayList = driver.findElements(By.xpath("//*[@id='day']//option"));
		   driver.findElement(By.xpath("//*[@id='sex' and @value='1']")).click();
		   Thread.sleep(200);
		   driver.findElement(By.xpath("//*[@id='sex' and @value='2']")).click();

	
	   for(WebElement day:dayList) {
		   WebElement d2=dayList.get(25);
		   //System.out.println(d2.getText());
		   if(d2.getText().equals("26"))
		          d2.click();
		   //System.out.println(day.getText());
	   }
		  List<WebElement> monthList = driver.findElements(By.xpath("//*[@id='month']//option"));
		  for( WebElement month:monthList) {
			  WebElement m=monthList.get(9);
			  System.out.println(m.getText());
			  if(m.getText().equals("Oct"))
				  m.click();
			  
		  }
//		  
//		  List<WebElement> yearList = driver.findElements(By.xpath("//*[@id='year']//option"));
//		  for( WebElement year:yearList) {
//			  WebElement y=yearList.get(1);
//			  if(y.getText().equals("1995"))
//				  y.click();
//			  
//		  }
		  
		  
//			for(int i=0;i<monthList.size();i++) {
//				     String m= monthList.get(i).getText();
//				     System.out.println(m);
//				
//			}
//		  
//		  
		  
	   }
		   

	}
	


