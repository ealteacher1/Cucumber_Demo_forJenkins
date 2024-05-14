package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"step_Definitions","Utilities"},
				plugin= {
	    "pretty",
	    "html:target\\htmlReport\\cucumberReport.html ",
	    "json:target\\jsonCucumberReport\\json "
		}, 
		
		monochrome = false,
		dryRun = false,
//		tags="@abc"
		tags="@def"
//		 tags = "${CUCUMBER_TAG}"
	)


public class JunitRunner {

}
	