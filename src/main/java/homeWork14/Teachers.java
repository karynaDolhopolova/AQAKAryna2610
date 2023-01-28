package homeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teachers {
    @FindBy(xpath = "//*[@id=\"blockCoachesSearch\"]/div[1]/input")
    WebElement search;
    @FindBy(xpath = "//ul[contains(@class,\"block-coaches-search_list\")]/li")
    List<WebElement> coaches;

    public Teachers(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public void enterCoachName(String name) {
        search.sendKeys(name);
    }

    public void enterCoachName(TeacherNames teacherNames){
        search.sendKeys(teacherNames.getName());
    }
//    public List<WebElement> listOfCoaches (){
//        List<WebElement> coachInfo = (List<WebElement>) coaches;
//        for (WebElement c:coachInfo){
//            c.getText();
//        }
//        return coachInfo;
//    }
    public void listOfCoaches () {
        for (WebElement c : coaches) {
            System.out.println(c.findElement(By.className("coach-card_name")).getText()+" - "+c.findElement(By.className("coach-card_spec")).getText());
        }
    }
}


