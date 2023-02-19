package homeWork17.Steps;

import homeWork12.BaseClass1;
import homeWork17.BaseClass2;
import homeWork17.HillelHomepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs extends BaseClass2 {

    HillelHomepage hillelHomepage = new HillelHomepage(openChrome());

    @When("I open page {string}")
    public void iOpenPage(String url) {
        openChrome().get(url);
    }

//    @Then("Check title {string}")
//    public void checkTitle(String school) {
//        Assert.assertTrue(hillelHomepage.checkSchoolTitle(school));
//    }

    @Then("Check title {string}")
    public void checkTitle(String element) {
        Assert.assertTrue(hillelHomepage.checkMenuTitles(element));
    }
}
