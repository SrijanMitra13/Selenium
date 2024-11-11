package A_Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TestNg Listeners
public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed Listeners Pass Code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//Screenshot Code
		//Response if API is failed
		System.out.println("I failed executed Listeners Passcode " + result.getName());
	}
}
