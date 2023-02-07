package homeWork14;

import homeWork12.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teachers extends BaseClass1 {
    @FindBy(xpath = "//*[@id=\"blockCoachesSearch\"]/div[1]/input")
    WebElement search;
    @FindBy(xpath = "//ul[@class=\"block-coaches_list\"]//li")
    List<WebElement> coaches;

    public Teachers(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public void enterCoachName(String name) {
        search.sendKeys(name);
    }

    public void enterCoachName(TeacherNames teacherNames) {
        search.sendKeys(teacherNames.getName());
    }

    public void listOfCoaches() {
        try {
            getListOfCoaches();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (WebElement c : coaches) {
            System.out.println(c.findElement(By.className("coach-card_name")).getText() + " - " + c.findElement(By.className("coach-card_spec")).getText());
        }
    }

    private List<WebElement> getListOfCoaches() throws InterruptedException {
        Scrolling.scroll(driver);
        int i = 0;
        while (true) {
            if (coaches.size() > i&&i<=20) {
                i = coaches.size();
                Scrolling.scroll(driver);
                Thread.sleep(3000);
            } else {
                break;
            }
        }
        return coaches;
    }
}


