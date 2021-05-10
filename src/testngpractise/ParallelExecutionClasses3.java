package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionClasses3 {

	@Test
	public void testCase5() {
		Reporter.log("TC5",true);
	}
	
	@Test
	public void testCase6() {
		Reporter.log("TC6",true);
	}
	

}
