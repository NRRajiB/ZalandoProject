package TestRunnerZalando;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature_file\\zalando.feature",glue="com.zalando.Stepdefinition", dryRun=false, 
monochrome=true, tags= {"@Feature4","@SmokeTest"}, plugin= {"json:target/cucumber.json"})
public class TestRunner {

}
