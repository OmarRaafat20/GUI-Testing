package main.java.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import main.java.PageObjects.SelectProductsElements;
import main.java.Utils.Constants;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static main.java.PageEvents.ShoppingCartEvents.ClickOnAddToCartButton;


public class BaseTest {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public ExtentHtmlReporter htmlReporter;


    public static void ImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    public static WebDriver GetDriver() {
        return driver;
    }

    public static void ScrollDown1() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    public static void ScrollUp() throws InterruptedException {

        ElementFetch elementFetch = new ElementFetch();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementFetch.getWebElement("XPATH", SelectProductsElements.Cart));
    }

    public static void ScrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }








    public static void CloseTheObjectTap() {
        driver.close();
    }

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

    public void setupDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "geckodriver");
            driver = new ChromeDriver();
        }
    }

    @BeforeMethod
    @Parameters(value = {"browserName"})
    public void beforeMethoMethodd(String browserName, Method testMethod) {
        logger = extent.createTest(testMethod.getName());
        setupDriver(browserName);
        driver.manage().window().maximize();
        driver.get(Constants.Url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
        //driver.quit();
    }

    @AfterTest
    public void afterTestMethod() {
        extent.flush();
    }
}
