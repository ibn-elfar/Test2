package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    WebDriver driver;
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }
    By searchbox = By.id("APjFqb");
    By searchbutton = By.name("btnK");

    public void SetText(String text){
        driver.findElement(searchbox).sendKeys(text);
        driver.findElement(searchbox).submit();
    }

    /*public void SearchButtonClick(){
        driver.findElement(searchbutton).sendKeys(Keys.RETURN);
    }*/
}
