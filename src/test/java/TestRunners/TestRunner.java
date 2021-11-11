package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"src/main/java/steps"},
        plugin = {"pretty","html:target/cucumber-report.html",
                  "rerun:target/failed-tests/failed.txt"}
)
public class TestRunner {
}
