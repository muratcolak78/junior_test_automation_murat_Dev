package org.cb.ta.test.common;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Getter
public class ReportManager {
    protected ExtentReports extentReports;

    public ReportManager() {
        String path = "src/test/java/reports/index.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
    }

    public final ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();
    public void start(String name) {
        extentTestThreadLocal.set(extentReports.createTest(name));
    }

    public void pass(String message) {
        extentTestThreadLocal.get().pass(message);
    }
    public void skip(String message) {
        extentTestThreadLocal.get().skip(message);
    }

    public void fail(String message, String base64Screenshot) {
        extentTestThreadLocal.get().fail(message);
        extentTestThreadLocal.get().addScreenCaptureFromBase64String(base64Screenshot);
    }

    public void flush() {
        extentReports.flush();
    }

}

