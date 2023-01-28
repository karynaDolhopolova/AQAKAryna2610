package homeWork14;

import homeWork12.BaseClass1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TestTeachers extends BaseClass1 {
    static Teachers teachers = PageFactory.initElements(driver, Teachers.class);

    @BeforeClass
    public static void beforeTesting() {
        driver.get("https://dnipro.ithillel.ua/coaches");
    }

    @Test
    public void coachSearch() throws InterruptedException {
        teachers.enterCoachName(new TeacherNames());
        Thread.sleep(2000);
        teachers.listOfCoaches();


    }

}
