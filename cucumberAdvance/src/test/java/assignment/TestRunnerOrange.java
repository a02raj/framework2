package assignment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Assignment.feature", glue = {
		"assignment" }, monochrome = true, plugin = { "pretty", "html:Report/HtmlReport/Orange.html",
				"json:Report/JsonReport/Orange.json", "junit:Report/JunitReport/Orange.xml" })


public class TestRunnerOrange {

}
