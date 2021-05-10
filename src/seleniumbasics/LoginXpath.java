package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath extends Base {
	
	
	
	public boolean login(String username, String password) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
	    
	  //*[@class='button hover']
	    
	    driver.findElement(By.name("Submit")).click();
		return true;
	}
	
	public void invalidLogin(String username, String password){
		
		LoginXpath l=new LoginXpath();
		l.login(username,password);
		 String invalidMsg=driver.findElement(By.id("spanMessage")).getText();
		
		    if(invalidMsg.equals("Invalid credentials")) {
		    	System.out.println("invalid credentail test case pass");
		    }
		    else if(invalidMsg.equals("Password cannot be empty")){
		    	System.out.println("password not empty  test case pass");
		    }
		    else if(invalidMsg.equals("Username cannot be empty")) {
		    	System.out.println("username not empty  test case pass");
		    }
		    else {
		    	System.out.println("invalid testcase fail");
		    }
	
		
	}
	public boolean logout() throws InterruptedException {
		 Thread.sleep(2000);
		   driver.findElement(By.id("welcome")).click();
		   Thread.sleep(2000);
		   
		   driver.findElement(By.linkText("Logout")).click();
		   return true;
	}
	public static void main(String[] args) throws InterruptedException {
		intialize();
		LoginXpath loginXpath=new LoginXpath();
		boolean loginsucess=loginXpath.login("Admin", "admin123");
		if(loginsucess==true) {
			System.out.println("login test pass");
		}
	    boolean logoutsuceess=loginXpath.logout();
	    if(logoutsuceess==true) {
	    	System.out.println("logout test case pass");
	    }else {
	    	System.out.println("logout test case fail");
	    }
		//driver.navigate().back();
	    loginXpath.invalidLogin(" ", " ");
	
	}

}
