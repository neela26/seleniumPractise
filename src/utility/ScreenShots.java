package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void captureScreenShots(WebDriver driver,String filename) throws IOException {
	
		
	       TakesScreenshot sc=(TakesScreenshot)driver;
	       
	       File source = sc.getScreenshotAs(OutputType.FILE);
	        File destination= new File("F:\\manualTesting\\automation\\selenium\\screenshot\\"+filename+".png");
	       
	       FileHandler.copy(source, destination);
	       
	}
}
