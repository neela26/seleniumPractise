package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDatePickerHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\manualTesting\\sel\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();

		while(true) {
			String monthyeartitle = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			
			if(!(monthyeartitle.equals("February 2021"))){
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else {
				break;
			}
		}
		
		driver.findElement(By.xpath("//table//tbody//tr//td//a[text()='7']")).click();
//		
		
		
		
		
		driver.findElement(By.xpath("//* [@id='datepicker2']")).click();
		

		List<WebElement> monthlist = driver.findElements(By.xpath("//* [@title='Change the month']//option"));
//		Thread.sleep(2000);

		for(WebElement month:monthlist) {
			
			month.getText();
			if(month.getText().equals("February")) {
				month.click();
			}
		
		}
		
		WebElement datevalue = driver.findElement(By.xpath("//table//tbody//tr//td//a[text()='7']"));

		System.out.println("value="+datevalue.getText());
		datevalue.click();
	}
}
