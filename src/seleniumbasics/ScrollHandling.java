package seleniumbasics;

import java.awt.peer.ScrollbarPeer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
/***
 * 
 * @author Neelam

 *use javascriptExecutor interface to use javscript command for scrolling
 */
public class ScrollHandling extends Base {
	
	public void scrollPage(){
		LoginXpath l=new LoginXpath();
		l.login("admin", "admin123");
	    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	    WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_52']"));
	    
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		js.executeScript("arguments[0].click()",checkbox);
		
//		
	}
	
	
	public static void main(String[] args) {
		intialize();
	   ScrollHandling s=new ScrollHandling();
	   s.scrollPage();
		
	}

}
