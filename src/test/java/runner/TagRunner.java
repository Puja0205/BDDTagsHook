package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//features//",
 		glue={"stepdefs"},
 		
		monochrome = true,
		//tags= {"@Functional and not @SmokeTest"},
				tags= {"@EndToEnd"},
		plugin= {"pretty"}
)
public class TagRunner {

}
