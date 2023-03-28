package com.apcrm.step_definitions;

import com.apcrm.pages.ActivityStreamPage;
import com.apcrm.pages.LoginPage;
import com.apcrm.pages.ResultPage;
import com.apcrm.utilities.ConfigurationReader;
import com.apcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopPageSearchBar_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    ResultPage resultPage = new ResultPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the activity stream page")
    public void user_is_on_the_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apcrmUrl"));
        loginPage.userLoginInput.sendKeys(ConfigurationReader.getProperty("loginUsername"));
        loginPage.UserPasswordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginButton.click();
        Assert.assertEquals("Activity Stream", loginPage.activityStreamPageTitle.getText());
        System.out.println("The title of the page after login is " + loginPage.activityStreamPageTitle.getText());
//  TODO: different user login credentials for different users
    }

    @When("user enters {string} into the top-page search bar")
    public void user_enters_into_the_top_page_search_bar(String conversation) {
        System.out.println("The user enters " + conversation + " into the top-page search bar");
        activityStreamPage.topPageSearchBox.sendKeys(conversation + Keys.ENTER);
    }

    @And("user clicks on {string} in the conversations section")
    public void userClicksOnInTheConversationsSection(String conversation) {
        System.out.println("The user clicks on " + conversation + " in the conversations section");

    }

    @Then("user should see conversation about {string} in the result page")
    public void userShouldSeeConversationAboutInTheResultPage(String conversation) throws InterruptedException {
        System.out.println("The user should see " + conversation + " in the result page");

        Thread.sleep(5000);
        //wait.until(driver -> resultPage.pageTitle.getText().equals("Activity Stream"));
        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));
       //System.out.println("The title of the page after search is " + resultPage.pageTitle.getText());

        //Assert.assertEquals("Activity Stream", resultPage.pageTitle.getText());
        Assert.assertEquals(conversation, resultPage.searchedKeyword.getText());
        //Assert.assertTrue("The conversation cannot be found!", resultPage.searchedKeyword.getText().contains(conversation));

    }

//AC#2 ---------------------------------------------------------------------------------

    @And("user clicks on {string} in the other section")
    public void userClicksOnInTheOtherSection(String keyword) {
        System.out.println("The user clicks on " + keyword + " in the other section");
    }

    @Then("user should see {string} in the result page")
    public void userShouldSeeInTheResultPage(String keyword) {
        wait.until(ExpectedConditions.visibilityOf(resultPage.searchedKeyword));
        System.out.println("The user should see " + keyword + " in the result page");
        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));

        Assert.assertEquals(keyword, resultPage.searchedKeyword.getText());
        //Assert.assertEquals(keyword, resultPage.searchedKeyword.getText());
        //Assert.assertTrue("The conversation cannot be found!", resultPage.searchedKeyword.getText().contains(keyword));

    }

//AC#3 --------------------------------------------------------------------------------

    @And("user clicks on {string} in the groups section")
    public void userClicksOnInTheGroupsSection(String group) {
        System.out.println("The user clicks on " + group + " in the groups section");

    }

    @Then("user should see {string} workgroup in the result page")
    public void userShouldSeeWorkgroupInTheResultPage(String groups) {
        System.out.println("The user should see " + groups + " workgroup in the result page");
        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));
        Assert.assertEquals(groups, resultPage.searchedKeyword.getText());

    }


}

