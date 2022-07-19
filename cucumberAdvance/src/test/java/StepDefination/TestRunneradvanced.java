package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resources/Features/parameterization.feature",glue= {"StepDefination"},
monochrome=true,
plugin= {"pretty","html:Report/HtmlReport/Advance.html","json:Report/JsonReport/Advance.json",
		"junit:Report/JunitReport/Advance.xml"})
public class TestRunneradvanced {
	}
