package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\featureFile\\cmbrlist.feature", glue="com.sample.stepdefinition", dryRun=false, 
monochrome=true)
public class TestRunnerID {
	


}
