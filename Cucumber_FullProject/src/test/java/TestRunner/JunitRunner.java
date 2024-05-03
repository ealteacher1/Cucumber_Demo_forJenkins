package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
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
//		tags="@abc"
		 tags = "${CUCUMBER_TAG}"
	)


public class JunitRunner {

}
