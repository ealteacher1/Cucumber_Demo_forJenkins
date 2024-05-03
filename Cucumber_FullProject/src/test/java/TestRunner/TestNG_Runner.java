package TestRunner;


import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"D:\\EAI\\workspace\\Cucumber_FullProject\\Cucumber_FullProject\\Features"},
		glue = {"step_Definitions","Utilities"},
				plugin= {
	    "pretty",
	    "html:D:\\EAI\\workspace\\Cucumber_FullProject\\Cucumber_FullProject\\target\\htmlReport\\cucumberReport.html ",
	    "json:D:\\EAI\\workspace\\Cucumber_FullProject\\Cucumber_FullProject\\target\\jsonCucumberReport\\json "
		}, 
		
		monochrome = false,
		dryRun = false,
		tags="@smoke and @regression"
	)



public class TestNG_Runner extends AbstractTestNGCucumberTests {

}
