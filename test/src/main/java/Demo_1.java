import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       /* WebElement txtarea = driver.findElement(By.id("APjFqb"));
        txtarea.sendKeys("Arsenal Stadium");
        txtarea.submit(); */
        WebElement link = driver.findElement(By.linkText("Gmail"));
        link.click();

    }
}
