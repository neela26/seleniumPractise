package testngpractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameteInTestNG {
	
	@Test
	@Parameters("browser")
	public void testCase1(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.out.println(name);	
		}
		else if(name.equalsIgnoreCase("MSEdge"))
		{
			System.out.println(name);	
		}
		
	}
	

}
