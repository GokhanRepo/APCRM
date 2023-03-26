package com.apcrm.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to each scenario and each step
*/


import com.apcrm.utilities.*;
import org.openqa.selenium.*;
import io.cucumber.java.*;


public class Hooks {

    //@Before (order = 1) // order = 1 --> means this will be executed second
    public void setupScenario() {
        System.out.println("====Setting up browser using cucumber @Before");
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value = "@db", order = 0)  //order = 0 --> means this will be executed first
    public void setupForDatabaseScenarios() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }


    @After
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value and screenshot will be captured
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);  //Array of byte's that represents the screenshot
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    // @BeforeStep
    public void setupStep() {
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}
