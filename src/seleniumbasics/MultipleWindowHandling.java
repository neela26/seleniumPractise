package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;

/***
 * 
 * @author Neelam
 * getWindowhandle() or getWindowHandles() method use to handle multiple window
 * what it returns getWindowhandles imp question and how to handle multiple question
 */
public class MultipleWindowHandling extends Base {

	public static void main(String[] args) throws InterruptedException {
	
		intialize();
//		LoginXpath loginXpath=new LoginXpath();
//		 loginXpath.login("Admin", "admin123");
		 //this method get parent or current open window id
	      String parentid = driver.getWindowHandle();
	      
	      System.out.println("id of parent window is:"+parentid);
	            
	     // Thread.sleep(2000);
	     driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	     driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	     driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//what it returns getWindowhandles imp question 
	     Set<String> allwindowid = driver.getWindowHandles();
	     
	     
	     
	     
//	     for(String id:allwindowid) {
//	    	 if(!(id.equals(parentid))) {
//		    	 System.out.println(id);
//                 driver.switchTo().window(id);
//                 Thread.sleep(2000);
//                driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
//                driver.close();
//	    	 }
//	     
//	        
//	     }
	     //Handling particular window
	     
	     
	     
	     String[] allWindowArray=new String[allwindowid.size()];
	     int i=0;
	     for(String id:allwindowid) {
	    	 
	    	 allWindowArray[i]=id;
	    	 i++;	    
	     }
	     
	     for(String id1:allWindowArray) {
    	 System.out.println(id1);
//    	 if(!(id1.equals(parentid))){
//	    	  driver.switchTo().window(id1);
//            Thread.sleep(2000);
//           driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
//           driver.close();
//	     }
	     
	     }
	     
	     
	     
	     
	     driver.switchTo().window(allWindowArray[3]);
       Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
      //driver.close();
	     
      driver.switchTo().defaultContent();
      
	     
	     
	     
	     
	     
	     
	     
//	    Object [] windowarray = allwindowid.toArray();
//          
//	     
//	   // String windowarray[]=new String[allwindowid.size()];
//	     System.out.println(windowarray.length);
	    //windowarray=(String[]) allwindowid.toArray();
         
//		 for (int i=1;i<windowarray.length;i++) {
//			 System.out.println(windowarray[i].toString());
//			// driver.switchTo().window(windowarray[i]);
////			 Thread.sleep(2000);
////           driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
////           driver.close();
//		 }
         
	}
}
