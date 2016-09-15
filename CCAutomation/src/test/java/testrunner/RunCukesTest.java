package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		monochrome = true,
		features = "features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue={"stepdefinition"})
public class RunCukesTest extends AbstractTestNGCucumberTests {

}
