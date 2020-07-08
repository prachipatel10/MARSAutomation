package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles", glue = "StepDefinition", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml",
		"rerun:target/rerun.txt" }, monochrome = true)

public class TestMarsRunner {

}
