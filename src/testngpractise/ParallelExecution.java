package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void testCase1() {
		Reporter.log("TC1",true);
	}
	
	@Test
	public void testCase2() {
		Reporter.log("TC2",true);
	}
	
	@Test
	public void testCase3() {
		Reporter.log("TC3",true);
	}

}
