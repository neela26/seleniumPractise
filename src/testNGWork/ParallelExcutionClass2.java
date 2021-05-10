package testNGWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExcutionClass2 {

	@Test(groups="smoke")
	public void testCase3() {
		Reporter.log("TC3",true);
	}
	
	@Test
	public void testCase4() {
		Reporter.log("TC4",true);
	}
}
