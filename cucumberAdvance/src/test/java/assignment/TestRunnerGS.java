package assignment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GoogleSearch.feature", glue = {
		"assignment" }, monochrome = true, plugin = { "pretty", "html:Report/HtmlReport/GS.html",
				"json:Report/JsonReport/GS.json", "junit:Report/JunitReport/GS.xml" })

public class TestRunnerGS {

}
