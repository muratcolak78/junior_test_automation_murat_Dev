package org.cb.ta.test.common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener implements ITestListener {

    ReportManager report = new ReportManager();
    FileWriterHtml writer = new FileWriterHtml("src/test/java/reports/rapor.html");
    //FileWriterTxt writer=new FileWriterTxt("src/test/java/reports/rapor.txt");
    int nmbrTest = 0;
    int nmbrPassed = 0;
    int nmbrFailed = 0;
    int nmbrSkipped = 0;

    public TestListener() throws IOException {
    }

    @Override
    public void onTestStart(ITestResult result) {
        nmbrTest++;
        writer.onStart(result, nmbrTest);
        System.out.print(result.getName() + " test case started: ");
        report.start(result.getName() + " test case started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        nmbrPassed++;
        writer.passed();
        System.out.print("PASSED\n");
        report.pass(result.getName() + " test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        nmbrFailed++;
        writer.failed();
        System.out.print("FAILED\n");
        report.fail(result.getName() + " test FAILED", "screenShot");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        nmbrSkipped++;
        writer.skipped();
        System.out.print("SKIPPED\n");
        report.skip(result.getName() + " test SKIPPED");
    }


    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        writer.closed(nmbrTest,nmbrPassed,nmbrFailed,nmbrSkipped);
        report.flush();
    }


}
