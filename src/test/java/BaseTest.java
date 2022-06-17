package test.java;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import main.java.Utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;


public class BaseTest {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public ExtentHtmlReporter htmlReporter;

    @BeforeTest
    public void beforeTestMethod() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + File.separator + "Reports" + File.separator + "AutomationReport.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Automation Test Result");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester ", "Omar Tango");
    }

    @BeforeMethod
    @Parameters(value = {"browserName"})

    public void beforeMethoMethodd(String browserName, Method testMethod) {
        logger = extent.createTest(testMethod.getName());
        setupDriver(browserName);
        driver.manage().window().maximize();
        driver.get(Constants.ShgardiLoginPage);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }

    @AfterMethod
    public void afterMethoMethodd(ITestResult result) {

        if (result.getStatus() == ITestResult.SUCCESS) {
            String MethodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + MethodName + "Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS, m);

        } else if (result.getStatus() == ITestResult.FAILURE) {
            String MethodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + MethodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL, m);

        } else if (result.getStatus() == ITestResult.SKIP) {
            String MethodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + MethodName + "Skipped";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            logger.log(Status.SKIP, m);
        }
    }


    @AfterTest
    public void afterTestMethod() {
        extent.flush();
    }

    public void setupDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "geckodriver");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
        }
    }
    public void WaitMethod () throws InterruptedException {
        Thread.sleep(3000);
    }
    public void ScrollDown () {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,800)");
    }
    public void MoveToTheNewTab() {
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }
    public void MoveToAlert() {
        //driver.switchTo().activeElement().findElement(By.id("mat-dialog-0")).click();
        driver.switchTo().alert().accept();
    }


}
