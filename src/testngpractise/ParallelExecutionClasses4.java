package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionClasses4 {

	@Test
	public void testCase7() {
		Reporter.log("TC7",true);
	}
	
	@Test
	public void testCase8() {
		Reporter.log("TC8",true);
	}
	

}
