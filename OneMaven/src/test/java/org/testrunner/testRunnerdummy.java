package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\featureFile\\dummy.feature", glue="dummy.stepdefinition", dryRun=false, monochrome=true, 
plugin= {"pretty", "html:target/cucumber_report1", "rerun:rerun/newfaiil.txt"})


public class testRunnerdummy {

}
