package stepsForHooks;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/hooksInBDD.feature", glue = {
		"stepsForHooks" }, monochrome = true, plugin = { "pretty", "html:Report/HtmlReport/Hooks.html",
				"json:Report/JsonReport/Hooks.json", "junit:Report/JunitReport/Hooks.xml" })
public class TestRunneraHooks {
}
