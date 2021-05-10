package pompage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {


WebDriver driver;
	
	@FindBy(xpath = "//*[@id='txtUsername']") 
	private WebElement username;
	
	@FindBy(xpath = "//*[@id='txtPassword']") 
	private WebElement password;
	
	
	@FindBy(xpath = "//*[@id='btnLogin']") 
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void loginWithCorrectCred()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
		
		
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
		
	}

}
