package testngpractise;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority=1)
	public void testcase1() {
		Reporter.log("Tc1",true);
	}
	
	@Test(priority=2)
	public void testcase2() {
		Reporter.log("Tc2",true);
		//Assert.fail();
	}
	

}
