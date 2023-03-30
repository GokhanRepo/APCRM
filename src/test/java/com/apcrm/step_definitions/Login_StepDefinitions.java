package com.apcrm.step_definitions;

import com.apcrm.pages.ActivityStreamPage;
import com.apcrm.pages.LoginPage;
import com.apcrm.utilities.BrowserUtils;
import com.apcrm.utilities.ConfigurationReader;
import com.apcrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @Given("user is on the apcrm login page")
    public void user_is_on_the_apcrm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apcrmUrl"));
    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        loginPage.userLoginInput.sendKeys(username);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.userPasswordInput.sendKeys(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("user should see the activity stream page")
    public void user_should_see_the_activity_stream_page() {

        Assert.assertEquals("Activity Stream", activityStreamPage.activityStreamPageTitle.getText());
        System.out.println("The title of the page after login is " + activityStreamPage.activityStreamPageTitle.getText());
    }


    @Then("user should see {string} message")
    public void userShouldSeeMessage(String errormessage) {
        //Assert.assertEquals("Incorrect login or password", loginPage.errorMessage.getText());
        Assert.assertEquals(errormessage, loginPage.errorMessage.getText());
        System.out.println("The error message is " + loginPage.errorMessage.getText());
        BrowserUtils.sleep(5);
    }

    @But("user should see {string} message after {int} tries")
    public void userShouldSeeMessageAfterFiveTries(String errormessageafter5tries, int fiveOrMore) {
try {
    //Assert.assertEquals("Please try again after one minute", loginPage.errorMessageAfter5Tries.getText());
    Assert.assertEquals(errormessageafter5tries, loginPage.errorMessageAfter5Tries.getText());
    System.out.println("The error message after 5 tries is " + loginPage.errorMessageAfter5Tries.getText());
    //BrowserUtils.sleep(5);
} catch (Exception e) {
    System.out.println("Exception = " + e.toString());
}


    }











}



