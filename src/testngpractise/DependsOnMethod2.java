package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	@Test(priority=1 ,dependsOnMethods="testngpractise.DependsOnMethod.testcase2")
	public void testcase3(){
		Reporter.log("tc3 from dependson2 class",true);
	}
}