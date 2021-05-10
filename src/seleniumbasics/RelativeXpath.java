package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

/* 
 * this show use of relative xpath
 * most preferable xpath contain double forward slash in  xpath//
 * eaasily traverse from parent to child  
 */
public class RelativeXpath extends Base {

	
	
	public static void main(String[] args) {
	intialize();
		LoginXpath loginXpath=new LoginXpath();
		 loginXpath.login("Admin", "admin123");
		 
		 driver.findElement(By.xpath("(//div[@class='quickLaunge']//a)[5]")).click();
//		 
//		 
		 
	}
}
