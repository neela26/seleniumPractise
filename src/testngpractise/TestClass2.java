package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test(priority=5,dependsOnMethods="testngpractise.TestClass.testCase2")
	public void testcase5() {
		Reporter.log("test case from test2 class",true);
	}
	
	
	

}
