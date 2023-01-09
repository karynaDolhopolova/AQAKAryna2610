package homeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaBasic {
    By courseTitle= By.className("course-descriptor_heading");
    By courseRate=By.xpath("//div[contains(@class, \"course-rating\")]");
    By courseDescription=By.xpath("//div[contains(@class, \"introduction_info\")]");

    public JavaBasic(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public String getCourseTitle () {
        String titleOfTheCourse;
        titleOfTheCourse=driver.findElement(courseTitle).getText();
        return titleOfTheCourse;
    }
    public String getCourseRate(){
        String rateOfTheCourse;
        rateOfTheCourse=driver.findElement(courseRate).getText();
        return rateOfTheCourse;
    }
    public String getCourseDescription(){
        String descriptionOfTheCourse;
        descriptionOfTheCourse=driver.findElement(courseDescription).getText();
        return descriptionOfTheCourse;
    }
}
