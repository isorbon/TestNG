package Review;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("the test case has failed and taking the screen shot" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("the test case has passed and taking the screen shot" + result.getName());
    }

}
