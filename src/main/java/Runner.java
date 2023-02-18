import homeWork12.BaseClass1;
import homeWork12.Browsers;
import homeWork12.DriverConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static homeWork12.BaseClass1.driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/homeWork17",
        glue = "homeWork17.Steps",
        tags = "@HillelHome"
)
public class Runner extends BaseClass1{
    @BeforeClass
    public static void startDr() {
        if (driver == null) {
            BaseClass1.openChrome();
        }
    }
    @AfterClass
    public static void endDr() throws InterruptedException {
        if (driver != null) {
            BaseClass1.closeChrome();
        }
    }
}
