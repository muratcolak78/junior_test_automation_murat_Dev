package org.cb.ta.test.common;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener {
    ReportManager report = new ReportManager();

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " test case started");
        report.start(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of the testcase PASSED is :" + result.getName());
        report.pass(result.getName() + " test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The name of the testcase FAILED is :" + result.getName());
        report.fail(result.getName() + " test failed","screenShot");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of the testcase SKIPPED is :" + result.getName());
    report.skip(result.getName() + " test skipped");
    }


    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        report.flush();
    }

}
