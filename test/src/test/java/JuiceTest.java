import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static properties.PropFileDemo.GetProperties;

public class JuiceTest {
    WebDriver driver;
    public static String browserName;
    @BeforeTest
    public void OpenTheSite(){
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test (priority = 1, groups = {"Regression"})
    public void Login(){
        driver = new ChromeDriver();
        driver.get(GetProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement SignIn = driver.findElement(By.linkText("Sign In"));
        SignIn.click();
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("omar1299");
        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("omar1299");
        WebElement LoginButton = driver.findElement(By.name("signon"));
        LoginButton.click();
        //Assertion
        String actual = driver.findElement(By.linkText("Sign Out")).getText();
        String expected = "Sign Out";
        Assert.assertTrue(actual.contains(expected));

        WebElement Signout = driver.findElement(By.linkText("Sign Out"));
        Signout.click();
    }

    @Test(dependsOnMethods ="Login",groups = "Regression")
    public void Invalidlogin(){
        WebElement SignIn = driver.findElement(By.linkText("Sign In"));
        SignIn.click();
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("omar12999");
        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("omar1299");
        WebElement LoginButton = driver.findElement(By.name("signon"));
        LoginButton.click();

        //Assertion
        String actual = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[1]")).getText();
        String expected = "Please enter your username and password.";
        Assert.assertTrue(actual.contains(expected));

    }
    @Test
    public void Print(){
        System.out.println("Omar");
    }
}
