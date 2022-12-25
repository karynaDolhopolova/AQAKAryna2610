package homeWork11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends BaseClass {
    public static void main(String[] args) {
        try {
            getLinkName("https://kharkiv.ithillel.ua/");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void getLinkName(String pageUrl) throws InterruptedException {
        WebElement headerLink;
        By findByXpath = By.xpath("//*[@id=\"body\"]/div/div[1]/div[2]/div/div/nav/ul/li[3]/a");
        driver.manage().window().maximize();
        driver.get(pageUrl);
        headerLink = driver.findElement(findByXpath);
        System.out.println(headerLink.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
