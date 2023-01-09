package homeWork13;

import homeWork12.BaseClass1;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJavaBasic extends BaseClass1 {
    static JavaBasic javaBasic;
    @BeforeClass
    public static void starT(){
        driver.get("https://ithillel.ua/courses/java-basic");
        javaBasic=new JavaBasic(driver);
    }
    @Test
    public void title(){
        System.out.println("Course title: "+javaBasic.getCourseTitle());
    }
    @Test
    public void rate(){
        System.out.println("Course rate: "+javaBasic.getCourseRate());
    }
    @Test
    public void description(){
        System.out.println("Course description: "+javaBasic.getCourseDescription());
    }
}
