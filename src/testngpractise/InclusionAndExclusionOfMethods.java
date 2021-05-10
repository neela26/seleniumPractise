package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethods {

	@Test
	public void testCase1() {
		Reporter.log("TC1",true);
	}
	
	@Test
	public void testCase2() {
		Reporter.log("TC2",true);
	}
	
	@Test(dependsOnMethods="testCase2")
	public void testCase3() {
		Reporter.log("TC3",true);
	}
	
	
	@Test
	public void extraMethod() {
		Reporter.log("Extra method as a testcase", true);
	}
	
	
}
