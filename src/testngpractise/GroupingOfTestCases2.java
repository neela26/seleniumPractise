package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingOfTestCases2 {

//	@B{
//		Reporter.log("before class",true);
//	}
//	
	
	
	
	@Test(groups = "Regression")
	public void testCase1() {
		Reporter.log("TC1 from test2-Regression", true);

		//System.out.println("TC1");
	}

	@Test(groups = "sanity")
	public void testCase2() {
		
		Reporter.log("TC2  from test2-sanity", false);
	}

	@Test(groups = "Regression")
	public void extraMethod() {
		Reporter.log("Extra method  from test2-Regression", true);
		//Assert.fail("Assertion failed deliberately");
		
	}

	@Test(groups = {"sanity","Regression"})
	public void testCase3() {
		Reporter.log("TC3  from test2 sanity and regression", true);
		
	}

	@Test(dependsOnGroups = "sanity")
	public void testCase5() {
		Reporter.log("TC3  from test2", true);
	}

//	@Test
//	public void testCase6() {
//		Reporter.log("This is testcase 6 which executes multiple times  from test2", true);
//
//	}
}
