import POM.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageTest {
   private static WebDriver driver;

    public static void main(String[] args) {
        GoogleSearchTest();

    }

    public static void GoogleSearchTest(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        GoogleSearchPage googlepage = new GoogleSearchPage(driver);
        googlepage.SetText("Arsenal Football Club");
        //googlepage.SearchButtonClick();
    }
}
