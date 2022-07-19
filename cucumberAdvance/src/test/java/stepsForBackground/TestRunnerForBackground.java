package stepsForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/backGroundDemo.feature", glue = {
		"stepForBackground" }, monochrome = true, plugin = { "pretty", "html:Report/HtmlReport/Background.html",
				"json:Report/JsonReport/Background.json", "junit:Report/JunitReport/Background.xml" })

public class TestRunnerForBackground {

}
