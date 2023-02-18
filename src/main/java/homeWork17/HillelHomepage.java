package homeWork17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public boolean checkSchoolTitle(String school) {
      return this.school.findElement(By.className("site-nav-link")).getText().equals(school);
    }
    public boolean checkCoursesTitle() {
        return courses.findElement(By.className("site-nav-link")).getText().equals("Курси");
    }
    public boolean checkEmploymentTitle() {
        return employment.findElement(By.className("site-nav-link")).getText().equals("Працевлаштування");
    }
    public boolean checkBlogTitle() {
        return blog.findElement(By.className("site-nav-link")).getText().equals("Блог");
    }
    public boolean checkContactsTitle() {
        return contacts.findElement(By.className("site-nav-link")).getText().equals("Контакти");
    }
}

