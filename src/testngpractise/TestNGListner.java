package testngpractise;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ExcelWriter;
import utility.ScreenShots;

public class TestNGListner extends TestNGBase implements ITestListener {

	@Override
	public void onStart(ITestContext context) {

		System.out.println("stating Processing test:"+context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("starting of test case:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case pass:"+result.getName());
		
//		try {
//			ExcelWriter.excelWriteData(10, 0,result.getName());
//			ExcelWriter.excelWriteData(10, 1,"PASS");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase fail:"+result.getName());
		String testname=result.getName();
//		try {
//		
//			ScreenShots.captureScreenShots(driver,testname);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		String[]  testdata={result.getName(),"FAIL"};
		try {
			//ExcelWriter.excelWriteData(testdata);
			ExcelWriter.excelWriteData(testdata);
			//ExcelWriter.excelWriteData(1,"FAIL");


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped:"+result.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finsihing the process:"+context.getName());
	
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
