package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Features", glue = { "stepDefinitions" }, monochrome = true, plugin = {
		"json:target/cucumber.json", "pretty", "html:target/cucumber.html" })

public class TestRunner {

}


//@Cucumber.Options(features={"File1.feature", "File3.feature","File2.feature"})
//@CucumberOptions(features = "./Features",
