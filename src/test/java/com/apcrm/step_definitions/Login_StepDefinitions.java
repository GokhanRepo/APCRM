package com.apcrm.step_definitions;

import com.apcrm.utilities.ConfigurationReader;
import com.apcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.apcrm.pages.LoginPage;

public class Login_StepDefinitions {

    @Given("user is on the apcrm login page")
    public void user_is_on_the_apcrm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }

    @When("user enters {string} username")
    public void user_enter_username(String username) {
        LoginPage.loginInput.sendKeys(username);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {

        LoginPage.passwordInput.sendKeys(password);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        LoginPage.loginButton.click();
    }






//    @When("user enters {string} username")
//    public void user_enters_username(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("user enters {string} password")
//    public void user_enters_password(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}
