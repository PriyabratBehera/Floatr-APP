package com.qa.runners;
import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/iPhone14ProMax/cucumber",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/iPhone14ProMax/cucumber-html-reports"
        }
//        ,dryRun = true
        , monochrome = true
        , tags = "@MutualFundRegression"
        , glue = {"com.qa.stepdef"}
        , features = {"src/test/resources/features"}
)
public class iPhone14ProMax extends RunnerBase {

}

