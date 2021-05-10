package testNGWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmetrizationExecution {
	// to pass argument to any test case we can pass with 3 ways config file,excel file,and xml file
	
	static WebDriver driver;
	@Test
	@Parameters("browser")
	public void testCase1(String browsername){

		 if(browsername.equalsIgnoreCase("chrome")) {
		System.out.println(browsername);
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
		
	}
		 else if(browsername.equalsIgnoreCase("MSEdge")) {
				System.out.println(browsername); 
				System.setProperty("webdriver.edge.driver", "F:\\manualTesting\\sel\\edge_driver\\msedgedriver.exe");
				
				driver=new EdgeDriver();
				driver.get("https://www.amazon.in/");
				
				driver.close();
		 }
		 
		 
	}

}
