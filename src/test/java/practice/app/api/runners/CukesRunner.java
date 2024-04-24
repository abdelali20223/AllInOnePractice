package practice.app.api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        }   ,
        dryRun = false,
        features = "src/test/resources/feature_api",
        publish = true,
        glue = "practice/app/api/step_def",
        tags = "@us1"
)

public class CukesRunner {


}
