package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Base {
static WebDriver driver;
//LoginXpath l;
//public Base() {
//l=new LoginXpath(); 
//}
	
public static void intialize() {
	System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
}

}
