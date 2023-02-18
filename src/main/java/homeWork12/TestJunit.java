package homeWork12;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestJunit extends BaseClass1 {
    @BeforeClass
    public static void openChrome(){
        BaseClass1.driver=DriverConfig.createDriver(Browsers.CHROME);
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void inputFullName(){
        driver.findElement(By.id("userName")).sendKeys("Harry Potter");
    }

    @Test
    public void inputEmail(){
        driver.findElement(By.id("userEmail")).sendKeys("hogwarts@getnada.com");
    }
    @Test
    public void inputCurrentAddress(){
        driver.findElement(By.id("currentAddress")).sendKeys("England, Hogwarts School of Witchcraft and Wizardry");
    }
    @Test
    public void inputPermanentAddress(){
        driver.findElement(By.id("permanentAddress")).sendKeys("4 Privet Drive, Little Whinging");
    }
    @AfterClass
    public static void closeChrome() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
