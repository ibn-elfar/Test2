package properties;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Properties;

public class PropFileDemo {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
    GetProperties("browser");
    //SetProperties();
    }
    public static String GetProperties(String Key){
        String value = "";


        try {
            InputStream input = new FileInputStream(projectPath + "\\src\\main\\java\\properties\\Demo.properties");
            prop.load(input);
             value = prop.getProperty(Key);
            //String name2 = prop.getProperty("key");
            System.out.println(value);
            //System.out.println(name2);
            
        }

        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }
        return  value;


    }

    public static void SetProperties(){
        try {
            OutputStream output = new FileOutputStream(projectPath + "\\src\\main\\java\\properties\\Demo.properties");
            prop.setProperty("browser", "firefox");
            prop.store(output,"omar");
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }
    }
}
