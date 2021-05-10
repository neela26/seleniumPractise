package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/* 
 * this show use of relative xpath
 * most preferable xpath contain double forward slash in  xpath//
 * eaasily traverse from parent to child  
 */
public class MyLeave  extends Base{
	
	public static void main(String[] args) throws InterruptedException {
		
		intialize();
		LoginXpath loginXpath=new LoginXpath();
		 loginXpath.login("Admin", "admin123");
		 driver.findElement(By.xpath("(//div[@class='quickLaunge']//a)[5]")).click();

		 
      driver.findElement(By.xpath("//*[@id=\"calFromDate\"]")).click();
      Thread.sleep(2000);
      WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
      Thread.sleep(1000);
      month.click();
       Select monthselect=new Select(month);
       monthselect.selectByValue("0");
       
       WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
       Thread.sleep(2000);
       year.click();
       Select yearselect=new Select(year);
       yearselect.selectByVisibleText("2021");
       
	       WebElement date = driver.findElement(By.xpath("//tbody//tr//td//a[text()='7']"));
	       System.out.println(date.getText());
	       Thread.sleep(2000);
	       date.click();
	}

}
