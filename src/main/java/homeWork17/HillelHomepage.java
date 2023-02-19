package homeWork17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HillelHomepage {
    @FindBy(xpath = "//*[@id=\"body\"]/div/div[1]/div[2]/div/div/nav/ul/li[1]")
    WebElement school;
    @FindBy(xpath = "//*[@id=\"body\"]/div/div[1]/div[2]/div/div/nav/ul/li[2]")
    WebElement courses;
    @FindBy(xpath = "//li[contains(@class, \"site-nav-menu_item\")and contains(@class,\"employment\")]")
    WebElement employment;
    @FindBy(xpath = "//li[contains(@class, \"site-nav-menu_item\")and contains(@class,\"blog\")]")
    WebElement blog;
    @FindBy(className = "site-nav-menu_item")
    WebElement contacts;

    @FindBy (xpath = "//ul[@class=\"site-nav-menu_list\"]/li")
    List<WebElement> menu;

    public HillelHomepage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public boolean checkSchoolTitle(String school) {
      return this.school.findElement(By.className("site-nav-link")).getText().equals(school);
    }
    public boolean checkCoursesTitle(String courses) {
        return this.courses.findElement(By.className("site-nav-link")).getText().equals(courses);
    }
    public boolean checkEmploymentTitle(String employment) {
        return this.employment.findElement(By.className("site-nav-link")).getText().equals(employment);
    }
    public boolean checkBlogTitle(String blog) {
        return this.blog.findElement(By.className("site-nav-link")).getText().equals(blog);
    }
    public boolean checkContactsTitle(String contacts) {
        return this.contacts.findElement(By.className("site-nav-link")).getText().equals(contacts);
    }

    public boolean checkMenuTitles (String element){

        for (WebElement m:menu){
            return m.findElement(By.className("site-nav-link")).getText().equals(element);
        }
        return true;
    }
}

