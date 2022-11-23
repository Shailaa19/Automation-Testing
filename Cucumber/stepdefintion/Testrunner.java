package stepdefintion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/p4.feature",
glue= {"stepdefinition"},
monochrome=true,
plugin= {"pretty","html:target/HTML/p4.reports",
		"json:target/jsonreports/reports.json",
		"junit:target/junitreports/reports.xml"
}
)






















public class Testrunner {

}
