package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionClasses2 {
	@Test
	public void testCase3() {
		Reporter.log("TC3",true);
	}
	
	@Test
	public void testCase4() {
		Reporter.log("TC4",true);
	}
	

}
