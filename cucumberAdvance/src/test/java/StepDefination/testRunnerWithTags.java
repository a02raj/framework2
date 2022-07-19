package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resources/Features/tagsInBDD.feature",glue= {"StepDefination"},
monochrome=true,
tags = "~@Smoke or @Regression" ,
plugin= {"pretty","html:Report/HtmlReport/TagTest.html","json:Report/JsonReport/TagTest.json",
		"junit:Report/JunitReport/TagTest.xml"})
public class testRunnerWithTags {
	}