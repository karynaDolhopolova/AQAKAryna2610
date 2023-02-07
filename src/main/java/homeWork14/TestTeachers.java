package homeWork14;

import homeWork12.BaseClass1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TestTeachers extends BaseClass1 {
    static Teachers teachers;
    @BeforeClass
    public static void beforeTesting() {
        driver.get("https://dnipro.ithillel.ua/coaches");
        teachers= PageFactory.initElements(driver, Teachers.class);
    }

    @Test
    public void coachList(){
        teachers.listOfCoaches();
    }

}
