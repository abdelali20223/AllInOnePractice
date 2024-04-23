package practice.app.UI.runners;

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
        dryRun = true,
        features = "src/test/java/resources/feature_api",
        publish = true,
        glue = "practice/app/UI/step_def",
        tags = ""
)

public class CukesRunner {


}
