package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/FeatureBuscaBlog",
				"src/test/resources/FeatureFAP"},
		glue = { "stepDefinitions" }, 
		monochrome = true,
		strict = true,
		plugin = {"pretty", 
				"junit:target/XmlReports/report.xml", 
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports" }, 
		tags = ""
		)

public class TestRunner {
	
}
