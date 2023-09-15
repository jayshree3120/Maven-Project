package failtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunFailTestScripts implements IRetryAnalyzer {

    public int retryCount =0;
    public int maxCount=2;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxCount) {
            retryCount++;
            return true;
        }
            return false;
    }
}
