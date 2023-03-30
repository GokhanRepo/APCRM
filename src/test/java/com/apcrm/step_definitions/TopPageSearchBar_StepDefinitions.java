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
import org.openqa.selenium.JavascriptExecutor;
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
        loginPage.userPasswordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginButton.click();
        Assert.assertEquals("Activity Stream", activityStreamPage.activityStreamPageTitle.getText());
        System.out.println("The title of the page after login is " + activityStreamPage.activityStreamPageTitle.getText());
//  TODO: different user login credentials for different users
    }

    @When("user enters {string} into the top-page search bar")
    public void user_enters_into_the_top_page_search_bar(String conversation) {
        System.out.println("The user enters " + conversation + " into the top-page search bar");
//        activityStreamPage.topPageSearchBox.sendKeys(conversation + Keys.ENTER);
        activityStreamPage.topPageSearchBox.sendKeys(conversation);

    }

    @And("user clicks on {string} in the conversations section")
    public void userClicksOnInTheConversationsSection(String conversation) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//      wait.until(ExpectedConditions.visibilityOf(activityStreamPage.topPageSearchConversationsLink));
        js.executeScript("arguments[0].click();", activityStreamPage.topPageSearchConversationsLink);
        System.out.println("The user clicks on " + conversation + " in the conversations section");

    }

    @Then("user should see conversation about {string} in the result page")
    public void userShouldSeeConversationAboutInTheResultPage(String conversation) throws InterruptedException {


        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));
        Assert.assertEquals("Conversations", resultPage.pageTitle.getText());
        System.out.println("The user should see " + conversation + " in the result page");

//      wait.until(driver -> resultPage.pageTitle.getText().equals("Conversations"));
//      System.out.println("The title of the page after search is " + resultPage.pageTitle.getText());
//      Assert.assertTrue("The conversation cannot be found!", resultPage.searchedKeyword.getText().contains(conversation));
//      Assert.assertEquals(conversation, resultPage.searchedKeyword.getText());

    }

//AC#2 ---------------------------------------------------------------------------------

    @And("user clicks on {string} in the other section")
    public void userClicksOnInTheOtherSection(String keyword) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", activityStreamPage.topPageSearchOtherLink);
        System.out.println("The user clicks on " + keyword + " in the other section");
    }

    @Then("user should see {string} in the result page")
    public void userShouldSeeInTheResultPage(String keyword) {

        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));
        Assert.assertEquals(keyword, resultPage.pageTitle.getText());
        System.out.println("The user should see " + keyword + " in the result page");

//Assert.assertEquals(keyword, resultPage.searchedKeyword.getText());
//Assert.assertTrue("The conversation cannot be found!", resultPage.searchedKeyword.getText().contains(keyword));

    }

//AC#3 --------------------------------------------------------------------------------

    @And("user clicks on {string} in the groups section")
    public void userClicksOnInTheGroupsSection(String group) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", activityStreamPage.topPageSearchGroupsLink);
        System.out.println("The user clicks on " + group + " in the groups section");

    }

    @Then("user should see {string} workgroup in the result page")
    public void userShouldSeeWorkgroupInTheResultPage(String groups) {

        wait.until(ExpectedConditions.visibilityOf(resultPage.pageTitle));
        Assert.assertEquals(groups, resultPage.pageTitle.getText());
        System.out.println("The user should see " + groups + " workgroup in the result page");
    }


}

