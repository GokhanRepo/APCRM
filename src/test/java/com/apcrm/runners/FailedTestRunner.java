package com.apcrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/apcrm/step_definitions",
        features = "@target/rerun.txt"
)

public class FailedTestRunner {

}
