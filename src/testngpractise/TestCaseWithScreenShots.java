package testngpractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ScreenShots;

public class TestCaseWithScreenShots extends TestNGBase  {
	
	@Test(priority=1)
	public void loginTestCase() throws IOException {
	
		Properties pro =new Properties();
        FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		
		pro.load(fis);
		
		driver.findElement(By.xpath("//*[contains(@id, 'txtUser')]")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name = 'txtPassword']")).sendKeys("sdcs");
		driver.findElement(By.xpath("//*[contains(@name,'Submit')]")).click();
		
		String actual=driver.getCurrentUrl();
		
		String expected="https://opensource-demo.orangehrmlive.com/index.php/";
		Assert.assertEquals(true,false);
		
		
	
	}

}
