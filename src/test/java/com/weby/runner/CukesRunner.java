package com.weby.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                 "html:target/default-html-reports",
                 "rerun:target/rerun.txt"},
        features = "src/test/resources",
        glue = "com/weby/step_definitions",
       // publish=true,
        dryRun = false,
        tags = "@asd"
)
public class CukesRunner {
}
