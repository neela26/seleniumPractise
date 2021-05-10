package testngpractise;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestClassForListnerThroughXml {
	@Test(priority=1)
	public void testCase1() {
		Reporter.log("TC1",true);
	}
	
	@Test(priority=2)
	public void testCase2() {
		Reporter.log("TC2",true);
		Assert.fail();
	}
	
	@Test(priority=3,dependsOnMethods="testCase2")
	public void testCase3() {
		Reporter.log("TC3",true);
	}

}
