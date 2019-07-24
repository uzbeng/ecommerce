package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition", 
				plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml"},
				monochrome = true, strict = true)

public class Runner {
	

}
