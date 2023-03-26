package com.apcrm.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber.json", // json reports
                "html:target/cucumber-report.html", // html reports
                "rerun:target/rerun.txt", // rerun failed scenarios
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", // pretty reports
        },
        features = "src/test/resources/features", // path to features
        glue = "com/apcrm/step_definitions", // path to step definitions
        dryRun = false, // set to true to check if all steps have code
        tags = "@login",
        publish = false // set to true to publish to the dashboard

)
public class CukesRunner {
}
