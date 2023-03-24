package com.apcrm.step_definitions;

import com.apcrm.utilities.ConfigurationReader;
import com.apcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.apcrm.pages.LoginPage;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the apcrm login page")
    public void user_is_on_the_apcrm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apcrmUrl"));
    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        loginPage.loginInput.sendKeys(username);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("user should see the activity stream page")
    public void user_should_see_the_activity_stream_page() {
        loginPage.loginButton.click();
        //Assert.assertEquals("Activity Stream", activityStream.pageTitle.getText());
    }

}
