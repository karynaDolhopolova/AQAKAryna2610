package homeWork17.Steps;

import homeWork12.BaseClass1;
import homeWork17.HillelHomepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs extends BaseClass1 {

    HillelHomepage hillelHomepage = new HillelHomepage();

    @When("I open page {string}")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @Then("Check title {string}")
    public void checkTitle(String school) {
        Assert.assertEquals(String.valueOf(hillelHomepage.checkSchoolTitle(school)),school);
    }

}
