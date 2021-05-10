package testngpractise;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass {

	
	@Test(priority = 1)
	public void testCase()
	{
		Reporter.log("TC",true);	
	}

	@Test(priority = 2, dependsOnMethods= "testCase")
	public void testCase1()
	{
		Reporter.log("tc1",true);
		Assert.assertEquals("Login", "Dashboard");
		
	}

	@Test(dependsOnMethods = {"testCase1"} , priority =3 )
	public void testCase2()
	{		
        Reporter.log("TC2",true);
		//Assert.assertEquals(true, false);
		
	}

	
}
