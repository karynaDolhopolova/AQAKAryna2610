package homeWork12;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass1 {
    public static WebDriver driver;

    @BeforeClass
    public static void openChrome() {
        driver = DriverConfig.createDriver(Browsers.CHROME);
    }

    @AfterClass
    public static void closeChrome() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }



    }
