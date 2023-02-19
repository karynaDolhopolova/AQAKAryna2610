package homeWork17;

import homeWork12.Browsers;
import homeWork12.DriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {
    private static WebDriver driver;


    public static WebDriver openChrome() {
        if (driver == null) {
            driver = DriverConfig.createDriver(Browsers.CHROME);
        }
        return driver;

    }
}