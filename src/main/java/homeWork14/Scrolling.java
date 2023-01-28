package homeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class Scrolling {

    private static Driver driver;

    public static void scroll (WebDriver driver, By by){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        boolean bool=true;
        while(bool){
            try{
                WebElement element = driver.findElement(by);
                bool=false;
            } catch (Exception ignore){
                js.executeScript("window.scrollBy(0,50)");
            }
        }

    }
    public static void ByVisibleElement(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(by);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
