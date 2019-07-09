package StepDefinations;

import PageObjects.FindAServiceNSWLocation;
import PageObjects.ServiceNSW;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ApplyNumberPlate {
    public static WebDriver driver;
    ServiceNSW sn;
    FindAServiceNSWLocation fasnl;

    public ApplyNumberPlate() {
        driver = Hooks.driver;
    }

    @Given("^I navigate to the (.+?)$")
    public void iNavigateToThe(String url) {
        driver.get(url);
        Assert.assertTrue("Home | Service NSW".equalsIgnoreCase(driver.getTitle()));
        sn = new ServiceNSW(driver);
    }

    @When("^I search for (.+?)$")
    public void iSearchFor(String searchTask) {
        sn.setSearchTask(searchTask);
        sn.clickSearchButton();
    }

    @When("^I Navigate to the searched page$")
    public void iNavigateToTheSearchedPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue("Search Results | Service NSW".equalsIgnoreCase(driver.getTitle()));
    }

    @When("^I Click on locate us Button$")
    public void iClickOnLocateUsButton() {
        sn.clickLocateUs();
    }

    @When("^I Land on Find a Service NSW Location Page$")
    public void iLandOnFindAServiceNSWLocationPage() {
        fasnl = new FindAServiceNSWLocation(driver);
        Assert.assertTrue("Find a Service NSW location | Service NSW".equalsIgnoreCase(driver.getTitle()));
    }

    @When("^I Enter the suburb as (.+?)$")
    public void iEnterTheSuburbAs(String sub) {
        fasnl.enterSearchSuburb(sub);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^I should see the Available service center as (.+?)$")
    public void seeAvailableServiceCenter(String location) {
        Assert.assertTrue(fasnl.verifyLocation(location));
    }
}