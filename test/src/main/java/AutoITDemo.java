import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class AutoITDemo {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        try {
            test();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void test() throws IOException {
        driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/ar/pdf_to_word");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
        try {
            Runtime.getRuntime().exec("G:\\FileUploadScript.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
