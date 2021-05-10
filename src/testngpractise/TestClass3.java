package testngpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {

	@Test(priority=1)
	public void testcase31() {
		Reporter.log("test cass31 from class3",true);
		
	}
}
