package TestRunner;


import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features"},
		glue = {"step_Definitions","Utilities"},
				plugin= {
	    "pretty",
	    "html:target\\htmlReport\\cucumberReport.html ",
	    "json:target\\jsonCucumberReport\\json "
		}, 
		
		monochrome = false,
		dryRun = false,
		tags="${cuke}"
	)



public class TestNG_Runner extends AbstractTestNGCucumberTests {

	@Parameters("cuke")
    @Override
    public Object[][] scenarios() {
        return super.scenarios();}

}
