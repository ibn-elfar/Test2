import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportDemo {
    public static void main(String[] args){
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Gmail Test");
        ////////////////////////////////
        WebDriver driver = new ChromeDriver();
        // log(Status, details)
        test.log(Status.INFO, "Start Test Case");
        driver.get("https://www.google.com/");
        test.pass("Get google");

        driver.manage().window().maximize();
        test.pass("Maximize the browser");

        WebElement link = driver.findElement(By.linkText("Gmail"));
        test.pass("Get Gmail");

        link.click();
        test.pass("Navigate to Gmail");

        // calling flush writes everything to the log file
        extent.flush();

    }
}
